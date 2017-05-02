package com.bjike.goddess.foreigntax.bo;

import com.bjike.goddess.foreigntax.enums.PaymentStatus;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @Author: [xiazhili]
 * @Date: [17-4-20]
 * @Description: [汇总条件传输对象]
 * @Version: [1.0.0]
 * @Copy: [com.bjike.goddess]
 */
public class TaxCollectBO implements Serializable {
    /**
     * 公司
     */
    private String company;

    /**
     * 所属月份
     */
    private String month;

    /**
     * 税种
     */
    private String taxType;

    /**
     * 税率(%)
     */
    private Double rate;

    /**
     * 税金
     */
    private Double tax;

    /**
     * 缴税状态
     */
    private PaymentStatus paymentStatus;

    /**
     * 付款日期
     */
    private String paymentDate;

    /**
     * 付款单位
     */
    private String paymentUnit;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentUnit() {
        return paymentUnit;
    }

    public void setPaymentUnit(String paymentUnit) {
        this.paymentUnit = paymentUnit;
    }


}