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
 * @date 2020-10-20 10:46:52
 */
@Data
@TableName("wage")
public class WageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 工资id
	 */
	@TableId
	private Integer wageId;
	/**
	 * 员工id
	 */
	private String engId;
	/**
	 * 日期
	 */
	private Date wageYm;
	/**
	 * 基本工资
	 */
	private Double basic;
	/**
	 * 加班单价
	 */
	private Double overprice;
	/**
	 * 深夜单价
	 */
	private Double nightprice;
	/**
	 * 休日单价
	 */
	private Double holidayprice;
	/**
	 * 总加班费
	 */
	private Double overwage;
	/**
	 * 缺勤单价
	 */
	private Double leaveprice;
	/**
	 * 缺勤扣除
	 */
	private Double leavewage;
	/**
	 * 职位奖金
	 */
	private Double positionwage;
	/**
	 * 现场奖金
	 */
	private Double sitewage;
	/**
	 * 其它(收税)
	 */
	private Double insothers;
	/**
	 * 合计
	 */
	private Double total;
	/**
	 * 劳动保险
	 */
	private Double laborins;
	/**
	 * 厚生年金保险
	 */
	private Double gouseiins;
	/**
	 * 通勤费
	 */
	private Double traffic;
	/**
	 * 其它(不收税)
	 */
	private Double others;
	/**
	 * 支给
	 */
	private Double wage;
	/**
	 * 备注
	 */
	private String remarks;

}
