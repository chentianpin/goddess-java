package com.bjike.goddess.intromanage.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.intromanage.bo.IndividualResumeBO;
import com.bjike.goddess.intromanage.dto.IndividualResumeDTO;
import com.bjike.goddess.intromanage.entity.IndividualResume;
import com.bjike.goddess.intromanage.service.IndividualResumeSer;
import com.bjike.goddess.intromanage.to.IndividualDisplayFieldTO;
import com.bjike.goddess.intromanage.to.IndividualResumeTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 个人简介业务接口实现
 *
 * @Author: [ sunfengtao ]
 * @Date: [ 2017-03-28 10:19 ]
 * @Description: [  ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("individualResumeApiImpl")
public class IndividualResumeApiImpl implements IndividualResumeAPI {

    @Autowired
    private IndividualResumeSer individualResumeSer;

    /**
     * 根据id查询个人简介
     *
     * @param id 个人简介唯一标识
     * @return class IndividualResumeBO
     * @throws SerException
     */
    @Override
    public IndividualResumeBO findById(String id) throws SerException {
        IndividualResume model = individualResumeSer.findById(id);
        return BeanTransform.copyProperties(model, IndividualResumeBO.class);
    }

    /**
     * 计算总条数
     *
     * @param dto 个人简介dto
     * @throws SerException
     */
    @Override
    public Long count(IndividualResumeDTO dto) throws SerException {
        return individualResumeSer.count(dto);
    }

    /**
     * 分页查询个人简介
     *
     * @return class IndividualResumeBO
     * @throws SerException
     */
    @Override
    public List<IndividualResumeBO> list(IndividualResumeDTO dto) throws SerException {
        return individualResumeSer.list(dto);
    }

    /**
     * 保存个人简介
     *
     * @param to 个人简介to
     * @return class IndividualResumeBO
     * @throws SerException
     */
    @Override
    public IndividualResumeBO save(IndividualResumeTO to) throws SerException {
        return individualResumeSer.save(to);
    }

    /**
     * 根据id删除个人简介
     *
     * @param id 个人简介唯一标识
     * @throws SerException
     */
    @Override
    public void remove(String id) throws SerException {
        individualResumeSer.remove(id);
    }

    /**
     * 更新个人简介
     *
     * @param to 个人简介to
     * @throws SerException
     */
    @Override
    public void update(IndividualResumeTO to) throws SerException {
        individualResumeSer.update(to);
    }

    /**
     * 设置个人简介显示字段
     *
     * @param username 用户名称数组
     * @param to       个人简介显示字段
     * @throws SerException
     */
    @Override
    public void setIndividualDisplayField(String[] username, IndividualDisplayFieldTO to) throws SerException {
        individualResumeSer.setIndividualDisplayField(username, to);
    }
}