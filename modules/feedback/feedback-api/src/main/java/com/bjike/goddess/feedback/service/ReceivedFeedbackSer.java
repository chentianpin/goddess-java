package com.bjike.goddess.feedback.service;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.feedback.bo.ProblemFeedbackBO;
import com.bjike.goddess.feedback.bo.ProblemResultBO;
import com.bjike.goddess.feedback.bo.ReceivedFeedbackBO;
import com.bjike.goddess.feedback.dto.ProblemFeedbackDTO;
import com.bjike.goddess.feedback.dto.ReceivedFeedbackDTO;
import com.bjike.goddess.feedback.entity.ProblemResult;
import com.bjike.goddess.feedback.entity.ReceivedFeedback;
import com.bjike.goddess.feedback.to.ProblemFeedbackTO;
import com.bjike.goddess.feedback.to.ReceivedFeedbackTO;

import java.util.List;

/**
 * 已受理的反馈业务接口
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-08-02 09:24 ]
 * @Description: [ 已受理的反馈业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface ReceivedFeedbackSer extends Ser<ReceivedFeedback, ReceivedFeedbackDTO> {
    /**
     * 已受理的反馈列表总条数
     */
    default Long count(ReceivedFeedbackDTO dto) throws SerException {
        return null;
    }
    /**
     * 一个已受理的反馈
     *
     * @return class ReceivedFeedbackBO
     */
    default ReceivedFeedbackBO getOne(String id) throws SerException {
        return null;
    }
    /**
     * 已受理的反馈
     *
     * @param dto 已受理的反馈模块dto
     * @return class ReceivedFeedbackBO
     * @throws SerException
     */
    default List<ReceivedFeedbackBO> list(ReceivedFeedbackDTO dto) throws SerException {
        return null;
    }

    /**
     * 提供建议
     *
     * @param to 已受理的反馈数据to
     * @return class ReceivedFeedbackBO
     * @throws SerException
     */
    default ReceivedFeedbackBO provideAdvice(ReceivedFeedbackTO to) throws SerException {
        return null;
    }

    /**
     * 编辑优先级
     *
     * @param to 已受理的反馈数据to
     * @return class ReceivedFeedbackBO
     * @throws SerException
     */
    default ReceivedFeedbackBO priority(ReceivedFeedbackTO to) throws SerException {
        return null;
    }
    /**
     * 最终解决方案录入
     *
     * @param to 已受理的反馈数据to
     * @return class ProblemResultBO
     * @throws SerException
     */
    default ProblemResultBO solve(ReceivedFeedbackTO to) throws SerException {
        return null;
    }

}