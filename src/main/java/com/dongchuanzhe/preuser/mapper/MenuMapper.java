package com.dongchuanzhe.preuser.mapper;

import com.dongchuanzhe.preuser.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dongchuanzhe.preuser.entity.MenuVO;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dcz
 * @since 2020-03-03
 */
public interface MenuMapper extends BaseMapper<Menu> {

    List<MenuVO> treeMenu(String parentIds);

    List<MenuVO> listMenusByUserName(String username);
}
