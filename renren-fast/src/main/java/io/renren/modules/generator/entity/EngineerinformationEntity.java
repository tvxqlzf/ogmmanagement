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
@TableName("engineerinformation")
public class EngineerinformationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 员工编号
	 */
	@TableId
	private String engId;
	/**
	 * 员工所属公司编号
	 */
	private String engComp;
	/**
	 * 员工姓名
	 */
	private String engName;
	/**
	 * 员工密码
	 */
	private String engPasw;
	/**
	 * 员工性别
	 */
	private String engSex;
	/**
	 * 员工年龄
	 */
	private Integer engAge;
	/**
	 * 员工生日
	 */
	private Date engBirthday;
	/**
	 * 员工住址
	 */
	private String engAddress;
	/**
	 * 员工最近车站
	 */
	private String engStation;
	/**
	 * 员工手机
	 */
	private String engPhone;
	/**
	 * 员工邮箱
	 */
	private String engEmail;
	/**
	 * 员工番号
	 */
	private String engNo;
	/**
	 * 员工银行账户
	 */
	private String engBank;
	/**
	 * 员工简历
	 */
	private String engResume;
	/**
	 * 员工自己PR
	 */
	private String engJpr;
	/**
	 * 员工技能
	 */
	private String engSkill;
	/**
	 * 员工经验年数
	 */
	private Double engExpyears;
	/**
	 * 员工国籍
	 */
	private String engCountry;
	/**
	 * 员工入职日期
	 */
	private Date engJoindate;
	/**
	 * 员工公司PR
	 */
	private String engCpr;
	/**
	 * 员工希望单金
	 */
	private Double engHopewage;
	/**
	 * 员工契约单金
	 */
	private Double engDeedwage;
	/**
	 * 员工日语等级
	 */
	private String engJplevel;
	/**
	 * 员工来日日期
	 */
	private Date engCjpdate;
	/**
	 * 员工保险状态
	 */
	private String inStatus;
	/**
	 * 员工保险等级
	 */
	private String inLevel;
	/**
	 * 员工紧急联络人姓名
	 */
	private String engConname;
	/**
	 * 员工紧急联络人电话
	 */
	private String engConphone;
	/**
	 * 员工在职状态
	 */
	private String engStatus;
	/**
	 * 员工离职时间
	 */
	private Date engResigndate;
	/**
	 * 员工抚养人数
	 */
	private Integer engRaise;

}
