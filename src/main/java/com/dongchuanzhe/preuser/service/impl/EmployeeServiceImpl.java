package com.dongchuanzhe.preuser.service.impl;

import com.dongchuanzhe.preuser.entity.Employee;
import com.dongchuanzhe.preuser.mapper.EmployeeMapper;
import com.dongchuanzhe.preuser.service.IEmployeeService;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
