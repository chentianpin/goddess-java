package com.bjike.goddess.projectmeasure.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.projectmeasure.dto.SingleProjectMultipleUIDTO;
import com.bjike.goddess.projectmeasure.entity.SingleProjectMultipleUI;

/**
 * 单个项目多个界面持久化接口, 继承基类可使用ｊｐａ命名查询
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-03-23 10:51 ]
 * @Description: [ ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface SingleProjectMultipleUIRep extends JpaRep<SingleProjectMultipleUI, SingleProjectMultipleUIDTO> {

}