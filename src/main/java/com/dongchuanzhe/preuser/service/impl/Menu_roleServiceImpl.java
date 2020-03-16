package com.dongchuanzhe.preuser.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dongchuanzhe.preuser.entity.Menu_role;
import com.dongchuanzhe.preuser.mapper.Menu_roleMapper;
import com.dongchuanzhe.preuser.service.IMenu_roleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
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
public class Menu_roleServiceImpl extends ServiceImpl<Menu_roleMapper, Menu_role> implements IMenu_roleService {

    @Resource
    private Menu_roleMapper menu_roleMapper;
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addmenuRole(Integer rid, Integer[] mids) throws Exception {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("rid",rid);
        menu_roleMapper.delete(queryWrapper);

        if(mids != null && mids.length >0){
            for (Integer mid : mids) {
                Menu_role menu_role = new Menu_role();
                menu_role.setMid(mid);
                menu_role.setRid(rid);
                menu_roleMapper.insert(menu_role);
            }
        }

    }
}
