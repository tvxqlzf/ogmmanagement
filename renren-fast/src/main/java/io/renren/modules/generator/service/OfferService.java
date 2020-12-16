package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.OfferEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-10-20 10:46:51
 */
public interface OfferService extends IService<OfferEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

