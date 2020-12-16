package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.WageDao;
import io.renren.modules.generator.entity.WageEntity;
import io.renren.modules.generator.service.WageService;


@Service("wageService")
public class WageServiceImpl extends ServiceImpl<WageDao, WageEntity> implements WageService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WageEntity> page = this.page(
                new Query<WageEntity>().getPage(params),
                new QueryWrapper<WageEntity>()
        );

        return new PageUtils(page);
    }

}