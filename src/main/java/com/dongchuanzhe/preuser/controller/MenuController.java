package com.dongchuanzhe.preuser.controller;


import com.dongchuanzhe.preuser.entity.User;
import com.dongchuanzhe.preuser.service.IMenuService;
import com.dongchuanzhe.preuser.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dcz
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Resource
    private IMenuService iMenuService;

    @RequestMapping("/list")
    public Result list(String parentIds){


        return Result.ok(iMenuService.treeMenu(parentIds));
    }

    @RequestMapping("/menuListByUserName")
    public Result menuListByUserName(HttpServletRequest request, @RequestParam(defaultValue = "lisi") String username){
        User user = (User) request.getSession().getAttribute("user");
        if(user!=null){
            username = user.getUsername();
        }
        return Result.ok(iMenuService.listMenusByUserName(username));
    }

}

