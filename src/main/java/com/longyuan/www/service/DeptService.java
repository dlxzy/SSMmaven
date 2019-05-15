package com.longyuan.www.service;

import java.util.List;
import java.util.Map;

import com.longyuan.www.pojo.Dept;

public interface DeptService {
	/**
	 * 添加部门
	 * @param dept
	 * @return
	 */
	public boolean addDept(Dept dept);
	/**
	 * 根据部门编号删除部门
	 * @param deptNo
	 * @return
	 */
	public boolean deleteDeptByNo(String deptNo);
	/**
	 * 根据部门编号修改部门领导人
	 * @param param
	 * @return
	 */
	public boolean updateDeptLeaderByNo(Map<String,Object> param);
	/**
	 * 根据部门编号查询部门
	 * @param deptNo
	 * @return
	 */
	public Dept queryDeptByNo(String deptNo);
	/**
	 * 根据部门名称和部门领导人查询部门
	 * @param deptName
	 * @param deptLeader
	 * @return
	 */
	public List<Dept> queryAllByDeptNameAndDeptLeader(Map<String,Object> param);
	/**
	 * 查询记录行数
	 * @return
	 */
	public int queryCount();
	/**
	 * 查询所有部门
	 * @return
	 */
	public List<Dept> queryAllDept();
}


