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
@TableName("bill")
public class BillEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 请求书id
	 */
	@TableId
	private String id;
	/**
	 * 社员id
	 */
	private String engId;
	/**
	 * 年月
	 */
	private Date ym;
	/**
	 * 连接地址
	 */
	private String link;
	/**
	 * 项目id
	 */
	private String pId;

}
