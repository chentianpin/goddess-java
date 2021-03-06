package com.bjike.goddess.qualifications.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.qualifications.bo.CompanyInfoBO;
import com.bjike.goddess.qualifications.dto.CompanyInfoDTO;
import com.bjike.goddess.qualifications.to.CompanyInfoTO;
import com.bjike.goddess.qualifications.to.GuidePermissionTO;

import java.util.List;

/**
 * 公司基本信息业务接口
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-03-31 06:38 ]
 * @Description: [ 公司基本信息业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface CompanyInfoAPI {

    /**
     * 保存
     *
     * @param to 公司基本信息传输对象
     * @return
     * @throws SerException
     */
    default CompanyInfoBO save(CompanyInfoTO to) throws SerException {
        return null;
    }

    /**
     * 修改
     *
     * @param to 公司基本信息传输对象
     * @return
     * @throws SerException
     */
    default CompanyInfoBO update(CompanyInfoTO to) throws SerException {
        return null;
    }

    /**
     * 删除
     *
     * @param id 公司基本信息ID
     * @return
     * @throws SerException
     */
    default CompanyInfoBO delete(String id) throws SerException {
        return null;
    }

    /**
     * 获取全部
     *
     * @return
     * @throws SerException
     */
    default List<CompanyInfoBO> all() throws SerException {
        return null;
    }

    /**
     * 列表
     *
     * @param dto 公司基本信息数据传输对象
     * @return
     * @throws SerException
     */
    default List<CompanyInfoBO> maps(CompanyInfoDTO dto) throws SerException {
        return null;
    }

    /**
     * 获取总条数
     *
     * @return
     * @throws SerException
     */
    default Integer getTotal() throws SerException {
        return null;
    }

    /**
     * 根据id获取数据
     *
     * @param id 数据id
     * @return
     * @throws SerException
     */
    default CompanyInfoBO getById(String id) throws SerException {
        return null;
    }
    /**
     * 导航权限
     */
    default Boolean guidePermission(GuidePermissionTO guidePermissionTO) throws SerException {
        return null;
    }
}