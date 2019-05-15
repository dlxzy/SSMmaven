package com.longyuan.www.service;

import java.util.List;
import java.util.Map;

import com.longyuan.www.pojo.Work;;

public interface WorkService {
	/**
	 * 添加工人
	 * @param work
	 * @return
	 */
	public boolean addWork(Work work);
	/**
	 * 根据编号删除工人
	 * @param id
	 * @return
	 */
	public boolean deleteWorkById(int id);
	/**
	 * 根据编号修改work对象
	 * @param param
	 * @return
	 */
	public boolean updateWorkById(Map<String,Object> param);
	/**
	 * 根据编号查询工人对象
	 * @param id
	 * @return
	 */
	public Work selectWorkById(int id);
	/**
	 * 查询所有工人的信息
	 * @return
	 */
	public List<Work> showAllWork();

}


