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
@TableName("attendance")
public class AttendanceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 出勤id
	 */
	@TableId
	private Integer attId;
	/**
	 * 员工编号
	 */
	private String engId;
	/**
	 * 年月
	 */
	private Date attYm;
	/**
	 * 工作天数
	 */
	private Integer days;
	/**
	 * 工作总小时数
	 */
	private Double hours;
	/**
	 * 缺勤小时数
	 */
	private Double leavehours;
	/**
	 * 普通加班小时数
	 */
	private Double overtime;
	/**
	 * 深夜小时数
	 */
	private Double night;
	/**
	 * 休日小时数
	 */
	private Double holidayover;
	/**
	 * 交通费
	 */
	private Double traffic;
	/**
	 * 交通凭证
	 */
	private String traPicture;
	/**
	 * 作业报告书
	 */
	private String work;
	/**
	 * 时间表
	 */
	private String timetable;

}
