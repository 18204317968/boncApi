/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.boncApi.web;

import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.modules.boncApi.entitiy.CusTask;
import com.thinkgem.jeesite.modules.boncApi.service.CusTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 生成方案Controller
 * @author ThinkGem
 * @version 2013-10-15
 */
@Controller
@RequestMapping(value = "${frontPath}/doncApi")
public class CusTaskController extends BaseController {

	@Autowired
	private CusTaskService cusTaskService;

	/**
	 * 执行任务接口
	 * @author ThinkGem
	 * @version 2017-10-17
	 */
	@RequestMapping(value = "excuteTask")
	@ResponseBody
	public Map<String,Object> save(CusTask cusTask, Model model, RedirectAttributes redirectAttributes){
		//1.将客户的任务信息保存在业务表里
		cusTaskService.save(cusTask);
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("MSGCODE","success");
		map.put("SAVETIME",new Date());
		//2.请求数据库接口，发送关键词进行数据过滤，然后接收kafka中的数据


		//3.接收数据成功后调用ETL进行运算
		return map;
	}

	/**
	 * 下载查询结果明细
	 * @author ThinkGem
	 * @version 2017-10-17
	 */
	@RequestMapping(value = "downloadResult")
	@ResponseBody
	public Map<String,Object> downloadResult(CusTask cusTask, Model model, RedirectAttributes redirectAttributes){
		Map<String,Object> map=new HashMap<String, Object>();
		return map;
	}

	/**
	 * 删除任务接口
	 * @author ThinkGem
	 * @version 2017-10-17
	 */
	@RequestMapping(value = "deleteTask")
	@ResponseBody
	public Map<String,Object> delete(CusTask cusTask, Model model, RedirectAttributes redirectAttributes){
		//1.将客户的任务信息保存在业务表里
		cusTaskService.delete(cusTask);
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("MSGCODE","success");
		map.put("SAVETIME",new Date());
		return map;
	}

}
