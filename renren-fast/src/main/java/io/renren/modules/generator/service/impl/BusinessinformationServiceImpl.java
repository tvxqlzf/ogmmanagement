package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.BusinessinformationDao;
import io.renren.modules.generator.entity.BusinessinformationEntity;
import io.renren.modules.generator.service.BusinessinformationService;


@Service("businessinformationService")
public class BusinessinformationServiceImpl extends ServiceImpl<BusinessinformationDao, BusinessinformationEntity> implements BusinessinformationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BusinessinformationEntity> page = this.page(
                new Query<BusinessinformationEntity>().getPage(params),
                new QueryWrapper<BusinessinformationEntity>()
        );

        return new PageUtils(page);
    }

}