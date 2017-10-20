/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.boncApi.service;

import com.thinkgem.jeesite.common.service.BaseService;
import com.thinkgem.jeesite.modules.boncApi.dao.CusTaskLogDao;
import com.thinkgem.jeesite.modules.boncApi.entitiy.CusTaskLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 任务日志表Service
 * @author ThinkGem
 * @version 2013-10-15
 */
@Service
@Transactional(readOnly = true)
public class CusTaskLogService extends BaseService {

	@Autowired
	private CusTaskLogDao cusTaskLogDao;

	@Transactional(readOnly = false)
	public void save(CusTaskLog cusTaskLog) {
		cusTaskLogDao.insert(cusTaskLog);
	}


	@Transactional(readOnly = false)
	public void delete(CusTaskLog cusTaskLog) {
		cusTaskLogDao.delete(cusTaskLog);
	}



}
