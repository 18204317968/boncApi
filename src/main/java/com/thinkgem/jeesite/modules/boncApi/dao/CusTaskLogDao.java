/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.boncApi.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.boncApi.entitiy.CusTaskLog;

/**
 * 审批DAO接口
 * @author thinkgem
 * @version 2014-05-16
 */
@MyBatisDao
public interface CusTaskLogDao extends CrudDao<CusTaskLog> {


	public int insert(CusTaskLog cusTaskLog);

	public int update(CusTaskLog cusTaskLog);

}
