package com.bjike.goddess.eggert.dao;

import com.bjike.goddess.common.jpa.dao.JpaRep;
import com.bjike.goddess.eggert.dto.AssessmentInfoDTO;
import com.bjike.goddess.eggert.entity.AssessmentInfo;

/**
 * 评估信息持久化接口, 继承基类可使用ｊｐａ命名查询
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-04-02 02:19 ]
 * @Description: [ 评估信息持久化接口, 继承基类可使用ｊｐａ命名查询 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface AssessmentInfoRep extends JpaRep<AssessmentInfo, AssessmentInfoDTO> {

}