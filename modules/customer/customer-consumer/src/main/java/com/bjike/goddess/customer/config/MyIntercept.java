package com.bjike.goddess.customer.config;

import com.bjike.goddess.common.consumer.config.HIInfo;
import com.bjike.goddess.common.consumer.config.Interceptor;
import com.bjike.goddess.common.consumer.interceptor.auth.AuthIntercept;
import com.bjike.goddess.common.consumer.interceptor.limit.SmoothBurstyInterceptor;
import com.bjike.goddess.common.consumer.interceptor.login.LoginIntercept;
import com.bjike.goddess.customer.api.*;
import com.bjike.goddess.customer.entity.CustomerBaseInfo;
import com.bjike.goddess.customer.entity.CustomerDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 拦截器添加
 *
 * @Author: [liguiqin]
 * @Date: [2017-04-15 09:39]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
@Component
public class MyIntercept {
//    implements
// Interceptor {
//    @Autowired
//    private CustomerBaseInfoAPI customerBaseInfoAPI;
//    @Autowired
//    private CustomerDetailAPI customerDetailAPI;
//    @Autowired
//    private CusFamilyMemberAPI cusFamilyMemberAPI;
//    @Autowired
//    private CustomerLevelAPI customerLevelAPI;
//    @Autowired
//    private CusEmailAPI cusEmailAPI;
//
//    @Override
//    public List<HIInfo> customerInterceptors() {
//        /**
//         * 添加限流器
//         */
//        SmoothBurstyInterceptor smoothInterceptor = new SmoothBurstyInterceptor(1, SmoothBurstyInterceptor.LimitType.DROP);
//        HIInfo smoothInfo = new HIInfo(smoothInterceptor, "/**");
//        /**
//         * 权限拦截器
//         */
//        HIInfo authInfo = new HIInfo(new AuthIntercept(), "/**");
//        /**
//         * 登录拦截器
//         */
//        HIInfo loginInfo = new HIInfo(new LoginIntercept(customerBaseInfoAPI), "/**");
//
//        return Arrays.asList(smoothInfo, authInfo, loginInfo);
//    }
}