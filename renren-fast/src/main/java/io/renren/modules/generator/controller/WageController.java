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

import io.renren.modules.generator.entity.WageEntity;
import io.renren.modules.generator.service.WageService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-10-20 10:46:52
 */
@RestController
@RequestMapping("generator/wage")
public class WageController {
    @Autowired
    private WageService wageService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:wage:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wageService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{wageId}")
    @RequiresPermissions("generator:wage:info")
    public R info(@PathVariable("wageId") Integer wageId){
		WageEntity wage = wageService.getById(wageId);

        return R.ok().put("wage", wage);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:wage:save")
    public R save(@RequestBody WageEntity wage){
		wageService.save(wage);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:wage:update")
    public R update(@RequestBody WageEntity wage){
		wageService.updateById(wage);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:wage:delete")
    public R delete(@RequestBody Integer[] wageIds){
		wageService.removeByIds(Arrays.asList(wageIds));

        return R.ok();
    }

}
