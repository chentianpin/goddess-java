package com.bjike.goddess.supplier.to;

import com.bjike.goddess.common.api.entity.ADD;
import com.bjike.goddess.common.api.entity.EDIT;
import com.bjike.goddess.common.api.to.BaseTO;

import javax.validation.constraints.NotNull;

/**
 * 合作情况
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-03-20T11:05:37.654 ]
 * @Description: [ 合作情况 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class CooperationSituationTO extends BaseTO {
    /**
     * 供应商基本信息
     */
    @NotNull(message = "供应商信息传输错误", groups = {ADD.class, EDIT.class})
    private String informationId;

    /**
     * 公司名称
     */
    @NotNull(message = "公司名称不能为空", groups = {ADD.class, EDIT.class})
    private String companyName;

    /**
     * 产品服务内容
     */
    @NotNull(message = "产品服务内容不能为空", groups = {ADD.class, EDIT.class})
    private String product;

    /**
     * 合作时间
     */
    private String cooperationTime;

    /**
     * 合作期限
     */
    private String cooperationTerm;

    public String getInformationId() {
        return informationId;
    }

    public void setInformationId(String informationId) {
        this.informationId = informationId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCooperationTime() {
        return cooperationTime;
    }

    public void setCooperationTime(String cooperationTime) {
        this.cooperationTime = cooperationTime;
    }

    public String getCooperationTerm() {
        return cooperationTerm;
    }

    public void setCooperationTerm(String cooperationTerm) {
        this.cooperationTerm = cooperationTerm;
    }
}