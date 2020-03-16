package com.dongchuanzhe.preuser.controller;


import com.dongchuanzhe.preuser.service.ISalesService;
import com.dongchuanzhe.preuser.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dcz
 * @since 2020-03-14
 */
@RestController
@RequestMapping("/sales")
public class SalesController {

    @Resource
    private ISalesService iSalesService;
    @RequestMapping("/list")
    public Result list(){
        return Result.ok(iSalesService.list());
    }
}

