package com.longyuan.www.pojo;

import java.util.Date;

public class Work {
	private int id;
	private String workName;
	private String workAdress;
	private Date createTime;
	
	public Work() {
		super();
	}

	public Work(int id, String workName, String workAdress) {
		super();
		this.id = id;
		this.workName = workName;
		this.workAdress = workAdress;
	}
	
	public Work(int id, String workName, String workAdress, Date createTime) {
		super();
		this.id = id;
		this.workName = workName;
		this.workAdress = workAdress;
		this.createTime = createTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWorkName() {
		return workName;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
	}

	public String getWorkAdress() {
		return workAdress;
	}

	public void setWorkAdress(String workAdress) {
		this.workAdress = workAdress;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Work [id=" + id + ", workName=" + workName + ", workAdress="
				+ workAdress + ", createTime=" + createTime + "]";
	}
		

}
