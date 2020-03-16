package com.dongchuanzhe.preuser.service.impl;

import com.dongchuanzhe.preuser.entity.Menu;
import com.dongchuanzhe.preuser.entity.MenuVO;
import com.dongchuanzhe.preuser.mapper.MenuMapper;
import com.dongchuanzhe.preuser.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dcz
 * @since 2020-03-03
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

    @Resource
    private MenuMapper menuMapper;
    @Override
    public List<MenuVO> treeMenu(String parentIds) {
        return menuMapper.treeMenu(parentIds);
    }

    @Override
    public List<MenuVO> listMenusByUserName(String username) {
        return menuMapper.listMenusByUserName(username);
    }
}
