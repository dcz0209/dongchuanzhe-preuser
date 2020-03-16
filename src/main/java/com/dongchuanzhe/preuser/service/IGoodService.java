package com.dongchuanzhe.preuser.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dongchuanzhe.preuser.entity.Good;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dongchuanzhe.preuser.entity.GoodsVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dcz
 * @since 2020-03-14
 */
public interface IGoodService extends IService<Good> {

    IPage<GoodsVO> goodsList(Page<GoodsVO> page, GoodsVO goodsVO);
}
