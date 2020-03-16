package com.dongchuanzhe.preuser.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dongchuanzhe.preuser.entity.Role;
import com.dongchuanzhe.preuser.entity.RoleVO;
import com.dongchuanzhe.preuser.mapper.RoleMapper;
import com.dongchuanzhe.preuser.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dcz
 * @since 2020-03-03
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Resource
    private RoleMapper roleMapper;
    @Override
    public IPage<RoleVO> RoleMenu(Page page, RoleVO roleVO) {
        return roleMapper.RoleMenu(page,roleVO);
    }
}
