package com.bjike.goddess.materialreceive.config;

import com.bjike.goddess.common.consumer.config.HIInfo;
import com.bjike.goddess.common.consumer.config.Interceptor;
import com.bjike.goddess.common.consumer.interceptor.login.LoginIntercept;
import com.bjike.goddess.common.consumer.interceptor.login.StorageIntercept;
import com.bjike.goddess.storage.api.StorageUserAPI;
import com.bjike.goddess.user.api.UserAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: [sunfengtao]
 * @Date: [2017-05-25 09:46]
 * @Description: [ ]
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
@Component
public class CustomIntercept implements Interceptor {

    @Autowired
    private StorageUserAPI storageUserAPI;
    @Autowired
    private UserAPI userAPI;

    @Override
    public List<HIInfo> customerInterceptors() {
        HIInfo loginInfo = new HIInfo(new LoginIntercept(userAPI), "/**");
        HIInfo storage = new HIInfo(new StorageIntercept(storageUserAPI), "/**");

        return Arrays.asList(loginInfo, storage);
    }

}