package com.bjike.goddess.foreigntax.api;

import com.bjike.goddess.foreigntax.bo.CusPermissionBO;
import com.bjike.goddess.foreigntax.dto.CusPermissionDTO;
import com.bjike.goddess.foreigntax.to.CusPermissionTO;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.organize.bo.OpinionBO;

import java.util.List;

/**
 * 对外税务权限配置业务接口
 *
 * @Author: [ xiazhili ]
 * @Date: [ 2017-05-12 05:43 ]
 * @Description: [ 对外税务权限配置业务接口 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public interface CusPermissionAPI {


    /**
     * 对外税务权限列表总条数
     */
    default Long countPermission(CusPermissionDTO cusPermissionDTO) throws SerException {
        return null;
    }

    /**
     * 对外税务权限列表
     *
     * @param cusPermissionDTO 对外税务权限数据
     * @return CusPermissionBO
     * @throws SerException
     */
    default List<CusPermissionBO> list(CusPermissionDTO cusPermissionDTO) throws SerException {
        return null;
    }

    /**
     * 一个对外税务权限
     *
     * @param id 对外税务权限id
     * @return CusPermissionBO
     * @throws SerException
     */
    default CusPermissionBO getOneById(String id) throws SerException {
        return null;
    }


    /**
     * 对外税务权限操作者
     *
     * @param id 对外税务权限id
     * @return OpinionBO 返回数据
     * @throws SerException
     */
    default List<OpinionBO> listOperateById(String id) throws SerException {
        return null;
    }

    /**
     * 添加对外税务权限
     *
     * @param cusPermissionTO 对外税务权限数据
     * @return CusPermissionBO
     * @throws SerException
     */
    default CusPermissionBO add(List<CusPermissionTO> cusPermissionTO) throws SerException {
        return null;
    }

    /**
     * 编辑对外税务权限
     *
     * @param cusPermissionTO 对外税务权限数据
     * @return CusPermissionBO
     * @throws SerException
     */
    default CusPermissionBO edit(CusPermissionTO cusPermissionTO) throws SerException {
        return null;
    }

    /**
     * 根据idFlag查询可以某种操作的对外税务权限
     *
     * @param idFlag 对外税务权限idFlag
     * @throws SerException
     */
    default Boolean getCusPermission(String idFlag) throws SerException {
        return null;
    }

    /**
     * 根据idFlag查询只有财务模块的才可以进行添加编辑删除操作
     *
     * @param idFlag 对外税务权限idFlag
     * @throws SerException
     */
    default Boolean busCusPermission(String idFlag) throws SerException {
        return null;
    }

}