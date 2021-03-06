package com.bjike.goddess.materialsummary.vo;

import com.bjike.goddess.common.api.type.Status;

/**
 * 物资分类周汇总表现层对象
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-05-22 10:45 ]
 * @Description: [ 物资分类周汇总表现层对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class MaterialClassifyWeekSumVO {

    /**
     * id
     */
    private String id;
    /**
     * 汇总起始时间
     */
    private String sumStartTime;

    /**
     * 汇总结束时间
     */
    private String sumEndTime;

    /**
     * 物资类型
     */
    private String deviceType;

    /**
     * 地区
     */
    private String area;

    /**
     * 部门(项目组)
     */
    private String projectGroup;

    /**
     * 总数量
     */
    private Integer totalQty;

    /**
     * 总金额
     */
    private Double amoutn;

    /**
     * 状态
     */
    private Status status;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSumStartTime() {
        return sumStartTime;
    }

    public void setSumStartTime(String sumStartTime) {
        this.sumStartTime = sumStartTime;
    }

    public String getSumEndTime() {
        return sumEndTime;
    }

    public void setSumEndTime(String sumEndTime) {
        this.sumEndTime = sumEndTime;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProjectGroup() {
        return projectGroup;
    }

    public void setProjectGroup(String projectGroup) {
        this.projectGroup = projectGroup;
    }

    public Integer getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(Integer totalQty) {
        this.totalQty = totalQty;
    }

    public Double getAmoutn() {
        return amoutn;
    }

    public void setAmoutn(Double amoutn) {
        this.amoutn = amoutn;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}