package com.dongchuanzhe.preuser.service;

import com.dongchuanzhe.preuser.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dongchuanzhe.preuser.entity.MenuVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dcz
 * @since 2020-03-03
 */
public interface IMenuService extends IService<Menu> {

    List<MenuVO> treeMenu(String parentIds);

    /**
     * 通过用户的名称查询用户拥有的菜单资源
     * @param username
     * @return
     */
    List<MenuVO> listMenusByUserName(String username);
}
