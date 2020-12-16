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

import io.renren.modules.generator.entity.EngineerinformationEntity;
import io.renren.modules.generator.service.EngineerinformationService;
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
@RequestMapping("generator/engineerinformation")
public class EngineerinformationController {
    @Autowired
    private EngineerinformationService engineerinformationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("generator:engineerinformation:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = engineerinformationService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{engId}")
    //@RequiresPermissions("generator:engineerinformation:info")
    public R info(@PathVariable("engId") String engId){
		EngineerinformationEntity engineerinformation = engineerinformationService.getById(engId);

        return R.ok().put("engineerinformation", engineerinformation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("generator:engineerinformation:save")
    public R save(@RequestBody EngineerinformationEntity engineerinformation){
		engineerinformationService.save(engineerinformation);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("generator:engineerinformation:update")
    public R update(@RequestBody EngineerinformationEntity engineerinformation){
		engineerinformationService.updateById(engineerinformation);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("generator:engineerinformation:delete")
    public R delete(@RequestBody String[] engIds){
		engineerinformationService.removeByIds(Arrays.asList(engIds));

        return R.ok();
    }

}
