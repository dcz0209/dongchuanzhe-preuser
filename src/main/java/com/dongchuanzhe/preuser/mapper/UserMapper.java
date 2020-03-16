package com.dongchuanzhe.preuser.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dongchuanzhe.preuser.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dongchuanzhe.preuser.entity.UserVO;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dcz
 * @since 2020-03-03
 */
public interface UserMapper extends BaseMapper<User> {

    IPage<UserVO> userList(Page<UserVO> page,UserVO userVO);
}
