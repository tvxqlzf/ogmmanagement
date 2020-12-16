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

import io.renren.modules.generator.entity.AttendanceEntity;
import io.renren.modules.generator.service.AttendanceService;
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
@RequestMapping("generator/attendance")
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:attendance:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = attendanceService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{attId}")
    @RequiresPermissions("generator:attendance:info")
    public R info(@PathVariable("attId") Integer attId){
		AttendanceEntity attendance = attendanceService.getById(attId);

        return R.ok().put("attendance", attendance);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:attendance:save")
    public R save(@RequestBody AttendanceEntity attendance){
		attendanceService.save(attendance);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:attendance:update")
    public R update(@RequestBody AttendanceEntity attendance){
		attendanceService.updateById(attendance);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:attendance:delete")
    public R delete(@RequestBody Integer[] attIds){
		attendanceService.removeByIds(Arrays.asList(attIds));

        return R.ok();
    }

}
