package com.dongchuanzhe.preuser.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dongchuanzhe.preuser.entity.User;
import com.dongchuanzhe.preuser.entity.UserVO;
import com.dongchuanzhe.preuser.mapper.UserMapper;
import com.dongchuanzhe.preuser.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public IPage<UserVO> userList(Page<UserVO> page, UserVO userVO) {
        return userMapper.userList(page,userVO);
    }


}
