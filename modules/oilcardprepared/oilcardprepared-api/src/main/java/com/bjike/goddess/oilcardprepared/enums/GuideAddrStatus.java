package com.bjike.goddess.oilcardprepared.enums;

/**
 * 导航栏类型
 *
 * @Author: [tanghaixiang]
 * @Date: [2017-03-20 19:57]
 * @Description: [导航栏类型]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public enum GuideAddrStatus {

    /**
     * 列表
     */
    LIST(0),
    /**
     * 添加
     */
    ADD(1),
    /**
     * 编辑
     */
    EDIT(2),
    /**
     * 审核
     */
    AUDIT(3),
    /**
     * 删除
     */
    DELETE(4),
    /**
     * 汇总
     */
    COLLECT(5),
    /**
     * 对比
     */
    CONTRAST(6),
    /**
     * 查看
     */
    SEE(7),
    /**
     * 确认付款
     */
    PAY(8);

    private int code;

    GuideAddrStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

}
