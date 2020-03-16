package com.dongchuanzhe.preuser.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dongchuanzhe.preuser.entity.Role;
import com.dongchuanzhe.preuser.entity.RoleVO;
import com.dongchuanzhe.preuser.entity.User;
import com.dongchuanzhe.preuser.entity.UserVO;
import com.dongchuanzhe.preuser.service.IMenu_roleService;
import com.dongchuanzhe.preuser.service.IRoleService;
import com.dongchuanzhe.preuser.vo.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dcz
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Resource
    private IRoleService iRoleService;

    @Resource
    private IMenu_roleService iMenu_roleService;
    /**
     * 查询所有角色列表
     * @return
     */
    @RequestMapping("/list")
    public Result list(){
        return Result.ok(iRoleService.list());
    }
    @RequestMapping("/delete")
    public Result delete(Integer id){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("rid",id);
        iMenu_roleService.remove(queryWrapper);


        return Result.ok(iRoleService.removeById(id));
    }

    /**
     * 角色对应的菜单列表
     * @param pageNum
     * @param pageSize
     * @param roleVO
     * @return
     */
    @RequestMapping("/roleMenuList")
    public Result roleMenuList(@RequestParam(defaultValue = "1")Integer pageNum,
                               @RequestParam(defaultValue = "5")Integer pageSize, RoleVO roleVO) {
        Page<RoleVO> objectPage = new Page<RoleVO>(pageNum, pageSize);
        IPage<RoleVO> page = iRoleService.RoleMenu(objectPage, roleVO);

        return Result.ok(page);
    }

    @RequestMapping("/update")
    public Result updateRole(@RequestBody Role role){
        boolean b = iRoleService.updateById(role);

        return Result.ok(b);
    }

}

