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

import io.renren.modules.generator.entity.OfferEntity;
import io.renren.modules.generator.service.OfferService;
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
@RequestMapping("generator/offer")
public class OfferController {
    @Autowired
    private OfferService offerService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:offer:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = offerService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:offer:info")
    public R info(@PathVariable("id") String id){
		OfferEntity offer = offerService.getById(id);

        return R.ok().put("offer", offer);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:offer:save")
    public R save(@RequestBody OfferEntity offer){
		offerService.save(offer);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:offer:update")
    public R update(@RequestBody OfferEntity offer){
		offerService.updateById(offer);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:offer:delete")
    public R delete(@RequestBody String[] ids){
		offerService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
