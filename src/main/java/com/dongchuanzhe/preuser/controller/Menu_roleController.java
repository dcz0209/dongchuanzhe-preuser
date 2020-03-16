package com.dongchuanzhe.preuser.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dongchuanzhe.preuser.entity.Menu_role;
import com.dongchuanzhe.preuser.entity.User_role;
import com.dongchuanzhe.preuser.service.IMenu_roleService;
import com.dongchuanzhe.preuser.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
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
@RequestMapping("/menu_role")
public class Menu_roleController {

    @Resource
    private IMenu_roleService iMenu_roleService;

    @RequestMapping("/insert")
    public Result insert(Integer rid, Integer[] mids){

        try {
            iMenu_roleService.addmenuRole(rid,mids);
            return Result.ok(true);
        }catch (Exception e){
            e.printStackTrace();
            return Result.ok(false);
        }

    }



}

