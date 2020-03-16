package com.dongchuanzhe.preuser.service;

import com.dongchuanzhe.preuser.entity.Menu_role;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dcz
 * @since 2020-03-03
 */
public interface IMenu_roleService extends IService<Menu_role> {

    void addmenuRole(Integer rid, Integer[] mids) throws  Exception;
}
