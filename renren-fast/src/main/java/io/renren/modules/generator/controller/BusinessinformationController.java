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

import io.renren.modules.generator.entity.BusinessinformationEntity;
import io.renren.modules.generator.service.BusinessinformationService;
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
@RequestMapping("generator/businessinformation")
public class BusinessinformationController {
    @Autowired
    private BusinessinformationService businessinformationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:businessinformation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = businessinformationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{engId}")
    @RequiresPermissions("generator:businessinformation:info")
    public R info(@PathVariable("engId") String engId){
		BusinessinformationEntity businessinformation = businessinformationService.getById(engId);

        return R.ok().put("businessinformation", businessinformation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:businessinformation:save")
    public R save(@RequestBody BusinessinformationEntity businessinformation){
		businessinformationService.save(businessinformation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:businessinformation:update")
    public R update(@RequestBody BusinessinformationEntity businessinformation){
		businessinformationService.updateById(businessinformation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:businessinformation:delete")
    public R delete(@RequestBody String[] engIds){
		businessinformationService.removeByIds(Arrays.asList(engIds));

        return R.ok();
    }

}
