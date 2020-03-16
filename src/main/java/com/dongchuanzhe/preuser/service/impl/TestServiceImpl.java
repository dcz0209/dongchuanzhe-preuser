package com.dongchuanzhe.preuser.service.impl;

import com.dongchuanzhe.preuser.entity.Test;
import com.dongchuanzhe.preuser.mapper.TestMapper;
import com.dongchuanzhe.preuser.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dcz
 * @since 2020-03-03
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
