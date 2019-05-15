package com.longyuan.www.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.longyuan.www.mapper.DeptMapper;
import com.longyuan.www.mapper.WorkMapper;
import com.longyuan.www.pojo.Dept;
import com.longyuan.www.pojo.Work;
import com.longyuan.www.service.WorkService;

@Service("workService")
public class WorkServiceImpl implements WorkService {
	@Autowired
	private WorkMapper workMapper;
	@Autowired
	private DeptMapper deptMapper;
	
	
	@Transactional
	public boolean addWork(Work work) {
		try {
//			boolean f1 = deptMapper.addDept(new Dept("aaa","aaa","aaa","aaa"));
//			boolean f2 = workMapper.addWork(work);
//			return f1&&f2;
			boolean f = workMapper.addWork(work);
			return f;
		} catch (Exception e) {
			throw new RuntimeException();
		}

	}

	@Transactional
	public boolean deleteWorkById(int id) {
		
       try {
    	   	boolean f = workMapper.deleteWorkById(id);
   			System.out.println("--------------------------------------------------------");
//   			int j = 1/0;		
   			return f;
       } catch (Exception e) {
    	   throw new RuntimeException();
       }
		
	}

	@Transactional
	public boolean updateWorkById(Map<String, Object> param) {
		boolean f = workMapper.updateWorkById(param);
		return f;
	}

	public Work selectWorkById(int id) {
		Work work = workMapper.queryWorkById(id);		
		return work;
	}

	public List<Work> showAllWork() {
		List<Work> workList = workMapper.queryAllWork();
		return workList;
	}
	


}
