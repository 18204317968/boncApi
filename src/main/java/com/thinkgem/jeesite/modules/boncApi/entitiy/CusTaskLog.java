package com.thinkgem.jeesite.modules.boncApi.entitiy;

import com.thinkgem.jeesite.common.persistence.BaseEntity;

/**
 * Created by Administrator on 2017/10/16 0016.
 */
public class CusTaskLog extends BaseEntity<CusTaskLog> {


    private String taskId; 		//任务ID  与客户生成的id一样
    private String userId;         //用户Id
    private String pointName;      //任务执行到的节点
    private String pointState;      //任务节点执行状态 0未执行 1执行中 2执行成功

    public String getPointState() {
        return pointState;
    }

    public void setPointState(String pointState) {
        this.pointState = pointState;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    @Override
    public void preInsert() {

    }

    @Override
    public void preUpdate() {

    }
}
