package com.longyuan.www.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.longyuan.www.pojo.Work;
import com.longyuan.www.service.WorkService;

@Controller
@RequestMapping("Work")
public class WorkController {
	@Autowired
	private WorkService workService;
	
	@RequestMapping("/addWork.action")
	public String addWork(Work work){
		try {
			System.out.println("***********************************"+work.toString()+"***********************************************");
			boolean result = workService.addWork(work);
			System.out.println(result?"添加成功":"添加失败");
			if(result==true){
				return "work/success";
			}
		} catch (Exception e) {
				
		}
		return "work/error";
	}

	@RequestMapping("/deleteWorkById.action")
	public String deleteWorkById(int id){
		try {
			boolean result = workService.deleteWorkById(id);
			if(result==true){
				return "work/success";
			}				
		} catch (Exception e) {

		}
		return "work/error";
	}
	
	
	@RequestMapping("/updateWorkById.action")
	public String updateWorkById(Work work){
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("workName",work.getWorkName());
		param.put("workAdress",work.getWorkAdress());
		param.put("id",work.getId());
		param.put("createTime",null);
		boolean result = workService.updateWorkById(param);
		System.out.println(result?"修改成功":"修改失败");
		if(result==true){
			return "work/success";
		}else{
			return "work/error";
		}
		
	}
	
	
	@ResponseBody
	@RequestMapping("/queryWorkById.action")
	public Work queryWorkById(int id){
		Work work = workService.selectWorkById(id);
	
		return work;

	}
	
	
	@ResponseBody
	@RequestMapping("/queryAllWork.action")
	public List<Work> queryAllWork(){
		List<Work> workList = workService.showAllWork();
	
		return workList;

	}
}
