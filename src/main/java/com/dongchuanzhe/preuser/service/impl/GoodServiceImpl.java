package com.dongchuanzhe.preuser.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dongchuanzhe.preuser.entity.Good;
import com.dongchuanzhe.preuser.entity.GoodsVO;
import com.dongchuanzhe.preuser.mapper.GoodMapper;
import com.dongchuanzhe.preuser.service.IGoodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dcz
 * @since 2020-03-14
 */
@Service
public class GoodServiceImpl extends ServiceImpl<GoodMapper, Good> implements IGoodService {

    @Resource
    private GoodMapper goodMapper;
    @Override
    public IPage<GoodsVO> goodsList(Page<GoodsVO> page, GoodsVO goodsVO) {
        return goodMapper.goodsList(page,goodsVO);
    }
}
