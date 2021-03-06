package com.bjike.goddess.user.service.rbac;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.service.Ser;
import com.bjike.goddess.user.bo.rbac.GroupRoleBO;
import com.bjike.goddess.user.dto.rbac.GroupRoleDTO;
import com.bjike.goddess.user.entity.rbac.GroupRole;
import com.bjike.goddess.user.to.rbac.GroupRoleTO;

import java.util.List;

/**
 * 组角色业务接口
 *
 * @Author: [liguiqin]
 * @Date: [2017-02-28 15:47]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
public interface GroupRoleSer extends Ser<GroupRole, GroupRoleDTO> {

    /**
     * 通过一个或者多个组id获取组角色列表
     * @param ids 组id
     * @return
     * @throws SerException
     */
    default List<GroupRole> findByGroupIds(String ... ids) throws SerException {
        return null;
    }

    /**
     * 保存组
     *
     * @param groupRoleTO
     * @return
     * @throws SerException
     */
    default GroupRoleBO saveByTO(GroupRoleTO groupRoleTO) throws SerException {
        return null;
    }

}
