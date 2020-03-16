package com.dongchuanzhe.preuser.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dongchuanzhe.preuser.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dongchuanzhe.preuser.entity.RoleVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dcz
 * @since 2020-03-03
 */
public interface IRoleService extends IService<Role> {

    /**
     * 分页查询 所有角色   RoleVO中包含菜单的name  String字段
     * @param page
     * @param roleVO
     * @return
     */
    IPage<RoleVO> RoleMenu(Page page, RoleVO roleVO);
}
