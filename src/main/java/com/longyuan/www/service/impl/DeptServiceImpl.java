package com.longyuan.www.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.longyuan.www.mapper.DeptMapper;
import com.longyuan.www.pojo.Dept;
import com.longyuan.www.service.DeptService;
@Service("deptService")
public class DeptServiceImpl implements DeptService {
	@Autowired
	private DeptMapper deptMapper;
	
	public DeptMapper getDeptMapper() {
		return deptMapper;
	}

	public void setDeptMapper(DeptMapper deptMapper) {
		this.deptMapper = deptMapper;
	}

	@Transactional
	public boolean addDept(Dept dept) {
		boolean f = deptMapper.addDept(dept);
		return f;
	}

	@Transactional
	public boolean deleteDeptByNo(String deptNo) {
		boolean f = deptMapper.deleteDeptByNo(deptNo);
		return f;
	}

	@Transactional
	public boolean updateDeptLeaderByNo(Map<String, Object> param) {
		boolean f = deptMapper.updateDeptLeaderByNo(param);
		return f;
	}
	
	public Dept queryDeptByNo(String deptNo) {
		Dept dept = deptMapper.queryDeptByNo(deptNo);
		return dept;
	}
	
	public List<Dept> queryAllByDeptNameAndDeptLeader(Map<String, Object> param) {
		List<Dept> deptList = deptMapper.queryAllByDeptNameAndDeptLeader(param);
		return deptList;
	}

	public int queryCount() {
		int cnt = deptMapper.queryCount();
		return cnt;
	}
	
	public List<Dept> queryAllDept() {
		List<Dept> deptList = deptMapper.queryAllDept();
		return deptList;
	}


}
