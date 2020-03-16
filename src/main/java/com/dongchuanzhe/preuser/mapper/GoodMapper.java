package com.dongchuanzhe.preuser.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dongchuanzhe.preuser.entity.Good;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dongchuanzhe.preuser.entity.GoodsVO;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dcz
 * @since 2020-03-14
 */
public interface GoodMapper extends BaseMapper<Good> {

    IPage<GoodsVO> goodsList(Page<GoodsVO> page, GoodsVO goodsVO);
}
