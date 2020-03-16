package com.dongchuanzhe.preuser.service.impl;

import com.dongchuanzhe.preuser.entity.Nation;
import com.dongchuanzhe.preuser.entity.NationVO;
import com.dongchuanzhe.preuser.mapper.NationMapper;
import com.dongchuanzhe.preuser.service.INationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 城市字典表 服务实现类
 * </p>
 *
 * @author dcz
 * @since 2020-03-03
 */
@Service
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

    @Resource
    private NationMapper nationMapper;
    @Override
    public List<NationVO> findAll() {
        return nationMapper.findAll();
    }
}
