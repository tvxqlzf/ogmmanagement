package io.renren.modules.generator.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.generator.entity.BudgetEntity;
import io.renren.modules.generator.service.BudgetService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-10-20 10:46:51
 */
@RestController
@RequestMapping("generator/budget")
public class BudgetController {
    @Autowired
    private BudgetService budgetService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:budget:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = budgetService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{bId}")
    @RequiresPermissions("generator:budget:info")
    public R info(@PathVariable("bId") String bId){
		BudgetEntity budget = budgetService.getById(bId);

        return R.ok().put("budget", budget);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:budget:save")
    public R save(@RequestBody BudgetEntity budget){
		budgetService.save(budget);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:budget:update")
    public R update(@RequestBody BudgetEntity budget){
		budgetService.updateById(budget);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:budget:delete")
    public R delete(@RequestBody String[] bIds){
		budgetService.removeByIds(Arrays.asList(bIds));

        return R.ok();
    }

}
