package com.dongchuanzhe.preuser.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dongchuanzhe.preuser.entity.User;
import com.dongchuanzhe.preuser.entity.UserVO;
import com.dongchuanzhe.preuser.service.IUserService;
import com.dongchuanzhe.preuser.vo.Result;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dcz
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * userserive github 测试
     */
    @Resource
    private IUserService service;

    @RequestMapping("/login")
    public Result login(String username, String password, HttpServletRequest request){
        QueryWrapper<User> objectQueryWrapper = new QueryWrapper<>();
        objectQueryWrapper.eq("username", username);
        User result = service.getOne(objectQueryWrapper);
        //判断是否有该用户
        if(result != null){
            if(result.getPassword().equals(password)){
                request.getSession().setAttribute("user",result);
                return Result.ok(result);
            }

        }
        // 正确的情况
        return Result.no(2001,"用户名或密码错误");
    }






    @RequestMapping("/list")
    public Result list(@RequestParam(defaultValue = "1")Integer pageNum,
                       @RequestParam(defaultValue = "5")Integer pageSize, UserVO userVO){
        QueryWrapper<User> objectQueryWrapper = new QueryWrapper<>();
        Page<UserVO> objectPage = new Page<UserVO>(pageNum,pageSize);
        IPage<UserVO> page = service.userList(objectPage, userVO);

        return Result.ok(page);
    }
    @RequestMapping("/delete")
    public Result delete(String ids){
        String[] split = ids.split(",");
        List<String> strings = Arrays.asList(split);
        boolean b = service.removeByIds(strings);

        return Result.ok(b);
    }

    @RequestMapping("/insert")
    public Result insert(@RequestBody User user){
        return Result.ok(service.save(user));
    }

    @RequestMapping("/upload")
    public Result upload(MultipartFile file){
        if(file!= null && !file.isEmpty()){
            String originalFilename = file.getOriginalFilename();
            String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));
            String fileName = UUID.randomUUID().toString()+suffix;
            File file1 = new File("D:\\pic", fileName);
            try {
                file.transferTo(file1);
                return Result.ok("http://localhost:92/pic/"+fileName);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        return  null;


    }

    @RequestMapping("/update")
    public Result update(@RequestBody User user){
        service.updateById(user);

        return Result.ok(true);
    }
    @RequestMapping("/deleteById")
    public Result deleteById(Integer id){
        if(id != null){
            service.removeById(id);
        }
        return Result.ok(true);
    }
}

