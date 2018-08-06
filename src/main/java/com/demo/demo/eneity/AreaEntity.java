package com.demo.demo.eneity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-08-06 01:19:21
 */
public class AreaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	private Integer areaId;
	/**
	 * 区域名
	 */
	private Integer areaName;
	/**
	 * 优先级
	 */
	private Integer priority;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date lastEditTime;

	/**
	 * 设置：主键id
	 */
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	/**
	 * 获取：主键id
	 */
	public Integer getAreaId() {
		return areaId;
	}
	/**
	 * 设置：区域名
	 */
	public void setAreaName(Integer areaName) {
		this.areaName = areaName;
	}
	/**
	 * 获取：区域名
	 */
	public Integer getAreaName() {
		return areaName;
	}
	/**
	 * 设置：优先级
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	/**
	 * 获取：优先级
	 */
	public Integer getPriority() {
		return priority;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
	/**
	 * 获取：
	 */
	public Date getLastEditTime() {
		return lastEditTime;
	}
}
