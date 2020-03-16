package com.dongchuanzhe.preuser.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dongchuanzhe.preuser.entity.User_role;
import com.dongchuanzhe.preuser.service.IUser_roleService;
import com.dongchuanzhe.preuser.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dcz
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/user_role")
public class User_roleController {

    @Resource
    private IUser_roleService iUser_roleService;

    @RequestMapping("/insert")
    public Result insert(Integer uid, Integer[] rids){

        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("uid",uid);
        iUser_roleService.remove(queryWrapper);
        if(rids != null && rids.length >0){
            List<User_role> list = new ArrayList<>();
            for (Integer rid : rids) {
                User_role user_role = new User_role();
                user_role.setUid(uid);
                user_role.setRid(rid);
                list.add(user_role);
            }
            iUser_roleService.saveBatch(list);
        }

        return Result.ok(true);
    }
}

