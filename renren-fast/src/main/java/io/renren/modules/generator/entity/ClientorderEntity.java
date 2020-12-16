package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-10-20 10:46:51
 */
@Data
@TableName("clientorder")
public class ClientorderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 订单号
	 */
	@TableId
	private String orderId;
	/**
	 * 下单公司id
	 */
	private String compId;
	/**
	 * 被下单员工编号
	 */
	private String engId;
	/**
	 * 订单状态
	 */
	private String orderStatus;
	/**
	 * 项目编号
	 */
	private String pId;

}
