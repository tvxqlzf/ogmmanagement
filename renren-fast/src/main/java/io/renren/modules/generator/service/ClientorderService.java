package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.ClientorderEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-10-20 10:46:51
 */
public interface ClientorderService extends IService<ClientorderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

