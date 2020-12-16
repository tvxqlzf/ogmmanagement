package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.OfferDao;
import io.renren.modules.generator.entity.OfferEntity;
import io.renren.modules.generator.service.OfferService;


@Service("offerService")
public class OfferServiceImpl extends ServiceImpl<OfferDao, OfferEntity> implements OfferService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OfferEntity> page = this.page(
                new Query<OfferEntity>().getPage(params),
                new QueryWrapper<OfferEntity>()
        );

        return new PageUtils(page);
    }

}