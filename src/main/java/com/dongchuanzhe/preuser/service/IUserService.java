package com.dongchuanzhe.preuser.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dongchuanzhe.preuser.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dongchuanzhe.preuser.entity.UserVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dcz
 * @since 2020-03-03
 */
public interface IUserService extends IService<User> {

    IPage<UserVO> userList(Page<UserVO> page, UserVO userVO);

}
