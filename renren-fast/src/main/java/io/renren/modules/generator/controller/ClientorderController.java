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

import io.renren.modules.generator.entity.ClientorderEntity;
import io.renren.modules.generator.service.ClientorderService;
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
@RequestMapping("generator/clientorder")
public class ClientorderController {
    @Autowired
    private ClientorderService clientorderService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:clientorder:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = clientorderService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{orderId}")
    @RequiresPermissions("generator:clientorder:info")
    public R info(@PathVariable("orderId") String orderId){
		ClientorderEntity clientorder = clientorderService.getById(orderId);

        return R.ok().put("clientorder", clientorder);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:clientorder:save")
    public R save(@RequestBody ClientorderEntity clientorder){
		clientorderService.save(clientorder);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:clientorder:update")
    public R update(@RequestBody ClientorderEntity clientorder){
		clientorderService.updateById(clientorder);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:clientorder:delete")
    public R delete(@RequestBody String[] orderIds){
		clientorderService.removeByIds(Arrays.asList(orderIds));

        return R.ok();
    }

}
