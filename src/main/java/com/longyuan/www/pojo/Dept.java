package com.longyuan.www.pojo;
/**
 *  部门实体类
 * @author soft02
 *
 */
public class Dept {	
	private String deptNo;
	private String deptName;
	private String deptLoc;
	private String deptLeader;	
	
	public Dept() {
		super();
	}

	public Dept(String deptNo, String deptName, String deptLoc, String deptLeader) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
		this.deptLeader = deptLeader;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLoc() {
		return deptLoc;
	}

	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}

	public String getDeptLeader() {
		return deptLeader;
	}

	public void setDeptLeader(String deptLeader) {
		this.deptLeader = deptLeader;
	}

	@Override
	public String toString() {
		return "部门编号："+deptNo+",部门名称："+deptName+",部门地址："+deptLoc+",部门领导人："+deptLeader;
	}
	
	

}

