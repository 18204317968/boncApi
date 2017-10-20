package com.thinkgem.jeesite.modules.boncApi.entitiy;

import com.thinkgem.jeesite.common.persistence.BaseEntity;

import java.util.Date;

/**
 * Created by Administrator on 2017/10/16 0016.
 */
public class CusTask extends BaseEntity<CusTask> {

    private String taskId; 		//任务ID  与客户生成的id一样
    private String userId;         //用户Id
    private String taskName;       //任务名称
    private Date beginTime;      //数据时间范围（开始时间）
    private Date endTime;        //数据时间范围（结束时间）
    private String antistop;       //关键词（发送至数据库接口进行数据过滤）
    private String language;       //语种
    private String languageZh;     //语种2
    private String dataType;       //数据分类  新闻  社交  电商
    private String mediaLevel;     //媒体级别
    private String chooseData;     //数据源
    private String algorithModel;  //算法模型   情感  关键词  摘要
    private String dataModel;      //数据模型    数据态势 情感态势 情感分布  国家分布
    private String visualDatabase; //输出模型
    private Date   yuTime;         //预约执行时间
    private String state;          //0执行中，1执行成功，2数据分发中

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getYuTime() {
        return yuTime;
    }

    public void setYuTime(Date yuTime) {
        this.yuTime = yuTime;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getAntistop() {
        return antistop;
    }

    public void setAntistop(String antistop) {
        this.antistop = antistop;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguageZh() {
        return languageZh;
    }

    public void setLanguageZh(String languageZh) {
        this.languageZh = languageZh;
    }

    public String getMediaLevel() {
        return mediaLevel;
    }

    public void setMediaLevel(String mediaLevel) {
        this.mediaLevel = mediaLevel;
    }

    public String getChooseData() {
        return chooseData;
    }

    public void setChooseData(String chooseData) {
        this.chooseData = chooseData;
    }

    public String getAlgorithModel() {
        return algorithModel;
    }

    public void setAlgorithModel(String algorithModel) {
        this.algorithModel = algorithModel;
    }

    public String getDataModel() {
        return dataModel;
    }

    public void setDataModel(String dataModel) {
        this.dataModel = dataModel;
    }

    public String getVisualDatabase() {
        return visualDatabase;
    }

    public void setVisualDatabase(String visualDatabase) {
        this.visualDatabase = visualDatabase;
    }

    @Override
    public void preInsert() {

    }

    @Override
    public void preUpdate() {

    }
}
