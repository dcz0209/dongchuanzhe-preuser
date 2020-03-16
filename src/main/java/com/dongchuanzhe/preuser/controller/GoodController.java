package com.dongchuanzhe.preuser.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dongchuanzhe.preuser.entity.Good;
import com.dongchuanzhe.preuser.entity.GoodsVO;
import com.dongchuanzhe.preuser.entity.Goods_sales;
import com.dongchuanzhe.preuser.service.IGoodService;
import com.dongchuanzhe.preuser.service.IGoods_salesService;
import com.dongchuanzhe.preuser.vo.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dcz
 * @since 2020-03-14
 */
@RestController
@RequestMapping("/good")
public class GoodController {

    @Resource
    private IGoodService iGoodService;
    @Resource
    private IGoods_salesService iGoods_salesService;

    @RequestMapping("/list")
    public Result list(@RequestParam(defaultValue = "1")Integer pageNum,
                       @RequestParam(defaultValue = "5")Integer pageSize, GoodsVO goodsVO){
        Page<GoodsVO> objectPage = new Page<>(pageNum,pageSize);
        IPage<GoodsVO> goodsVOIPage = iGoodService.goodsList(objectPage, goodsVO);

        return Result.ok(goodsVOIPage);
    }

    @RequestMapping("/update")
    public Result update(@RequestBody GoodsVO goodsVO){
        Good good = goodsVO;
        iGoodService.updateById(good);
        QueryWrapper<Goods_sales> goods_salesQueryWrapper = new QueryWrapper<>();
        goods_salesQueryWrapper.eq("gid",goodsVO.getId());
        iGoods_salesService.remove(goods_salesQueryWrapper);
        String sids = goodsVO.getSids();

        String[] split = sids.split(",");
        List<Goods_sales> list = new ArrayList<>();
        for (String s : split) {
            Goods_sales goods_sales = new Goods_sales();
            goods_sales.setGid(goodsVO.getId());
            goods_sales.setSid(Integer.parseInt(s));
            list.add(goods_sales);
        }
        iGoods_salesService.saveBatch(list);

        return Result.ok(true);
    }
}

