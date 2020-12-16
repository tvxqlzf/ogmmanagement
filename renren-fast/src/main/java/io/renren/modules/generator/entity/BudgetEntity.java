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
@TableName("budget")
public class BudgetEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 预算书id
	 */
	@TableId
	private String bId;
	/**
	 * 员工id
	 */
	private String enId;
	/**
	 * 项目id
	 */
	private String pId;
	/**
	 * 年月
	 */
	private Date ym;
	/**
	 * 连接
	 */
	private String address;

}
