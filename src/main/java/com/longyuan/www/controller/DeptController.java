package com.longyuan.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.longyuan.www.pojo.Dept;
import com.longyuan.www.service.DeptService;

@Controller
@RequestMapping("Dept")
public class DeptController {
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("/addDept.action")
	public String addDept(Dept dept){
		System.out.println("部门编号："+dept.getDeptNo()+",部门名称："+dept.getDeptName()+",部门地址："+dept.getDeptLoc()+",部门领导人："+dept.getDeptLeader());
		boolean result = deptService.addDept(dept);
		System.out.println(result?"添加成功":"添加失败");
		if(result==true){
			return "dept/success";
		}else{
			return "dept/error";
		}
	}

	@ResponseBody
	@RequestMapping("/queryAllDept")
	public List<Dept> queryAllDept(){
		List<Dept> deptList = deptService.queryAllDept();
		System.out.println("-------------------------------"+deptList.size());
		return deptList;
	}
}
