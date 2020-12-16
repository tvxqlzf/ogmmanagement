package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.BudgetDao;
import io.renren.modules.generator.entity.BudgetEntity;
import io.renren.modules.generator.service.BudgetService;


@Service("budgetService")
public class BudgetServiceImpl extends ServiceImpl<BudgetDao, BudgetEntity> implements BudgetService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BudgetEntity> page = this.page(
                new Query<BudgetEntity>().getPage(params),
                new QueryWrapper<BudgetEntity>()
        );

        return new PageUtils(page);
    }

}