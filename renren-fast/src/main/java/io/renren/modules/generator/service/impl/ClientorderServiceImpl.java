package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.ClientorderDao;
import io.renren.modules.generator.entity.ClientorderEntity;
import io.renren.modules.generator.service.ClientorderService;


@Service("clientorderService")
public class ClientorderServiceImpl extends ServiceImpl<ClientorderDao, ClientorderEntity> implements ClientorderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ClientorderEntity> page = this.page(
                new Query<ClientorderEntity>().getPage(params),
                new QueryWrapper<ClientorderEntity>()
        );

        return new PageUtils(page);
    }

}