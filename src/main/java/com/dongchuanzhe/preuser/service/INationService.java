package com.dongchuanzhe.preuser.service;

import com.dongchuanzhe.preuser.entity.Nation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dongchuanzhe.preuser.entity.NationVO;

import java.util.List;

/**
 * <p>
 * 城市字典表 服务类
 * </p>
 *
 * @author dcz
 * @since 2020-03-03
 */
public interface INationService extends IService<Nation> {

    List<NationVO> findAll();
}
