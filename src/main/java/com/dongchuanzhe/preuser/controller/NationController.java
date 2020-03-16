package com.dongchuanzhe.preuser.controller;


import com.dongchuanzhe.preuser.entity.NationVO;
import com.dongchuanzhe.preuser.service.INationService;
import com.dongchuanzhe.preuser.vo.Result;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 城市字典表 前端控制器
 * </p>
 *
 * @author dcz
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/nation")
public class NationController {

    //@Resource
    //private RedisTemplate<String,List<NationVO>> redisTemplate;
    @Resource
    private INationService iNationService;

    @RequestMapping("/list")
    public Result list(){
        List<NationVO> nationOptions;
        nationOptions = iNationService.findAll();
        /*// 判断系统是否启动redis
        if(redisTemplate != null){
            //启动了redis 则从redis获取
            nationOptions = redisTemplate.opsForValue().get("nationOptions");
            //如果成功获取到值则返回
            if(nationOptions != null && nationOptions.size()>0){
                return  Result.ok(nationOptions);
            }
        }
        //系统没有启动redis 或者redis 没有值的情况
        nationOptions = iNationService.findAll();
        //判断系统是否启动redis  将数据存入redis
        if(redisTemplate != null){
            redisTemplate.opsForValue().set("nationOptions",nationOptions);
        }*/
        return  Result.ok(nationOptions);


    }
}

