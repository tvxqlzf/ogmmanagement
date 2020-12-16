package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.EngineerinformationDao;
import io.renren.modules.generator.entity.EngineerinformationEntity;
import io.renren.modules.generator.service.EngineerinformationService;


@Service("engineerinformationService")
public class EngineerinformationServiceImpl extends ServiceImpl<EngineerinformationDao, EngineerinformationEntity> implements EngineerinformationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EngineerinformationEntity> page = this.page(
                new Query<EngineerinformationEntity>().getPage(params),
                new QueryWrapper<EngineerinformationEntity>()
        );

        return new PageUtils(page);
    }

}