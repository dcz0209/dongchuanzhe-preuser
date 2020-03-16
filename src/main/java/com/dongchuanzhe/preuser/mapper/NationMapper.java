package com.dongchuanzhe.preuser.mapper;

import com.dongchuanzhe.preuser.entity.Nation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dongchuanzhe.preuser.entity.NationVO;

import java.util.List;

/**
 * <p>
 * 城市字典表 Mapper 接口
 * </p>
 *
 * @author dcz
 * @since 2020-03-03
 */
public interface NationMapper extends BaseMapper<Nation> {


    List<NationVO> findAll();
}
