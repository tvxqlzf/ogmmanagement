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
@TableName("businessinformation")
public class BusinessinformationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 员工编号
	 */
	@TableId
	private String engId;
	/**
	 * 入场时间
	 */
	private Date startdate;
	/**
	 * 精算范围
	 */
	private String wagerange;
	/**
	 * 单金
	 */
	private Double price;
	/**
	 * 预定退场时间
	 */
	private Date enddate;
	/**
	 * 营业状态
	 */
	private String busiStatus;
	/**
	 * 咨询总数
	 */
	private Integer advisoryNo;
	/**
	 * 面试总数
	 */
	private Integer interviewNo;
	/**
	 * 结果等待数
	 */
	private Integer resultWait;
	/**
	 * 待面试数
	 */
	private Integer interviewWait;

}
