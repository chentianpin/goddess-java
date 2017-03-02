package com.bjike.goddess.user.action.rbac;

import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.user.bo.rbac.RoleBO;
import com.bjike.goddess.user.entity.rbac.Role;
import com.bjike.goddess.user.service.rbac.PermissionAPI;
import com.bjike.goddess.user.service.rbac.RoleAPI;
import com.bjike.goddess.user.vo.RoleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 角色操作
 *
 * @Author: [liguiqin]
 * @Date: [2017-01-14 15:47]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike]
 */
@RestController
@RequestMapping("rbac/role")
public class RoleAct {
    @Autowired
    private RoleAPI roleAPI;

    /**
     * 异步获取角色树结构,逐层加载,参考ztree
     *
     * @param id 通过自身id查询下层子节点,参数为空时查询最顶层
     * @return 树结构数据
     * @throws ActException
     */
    @GetMapping("treeData")
    public ActResult treeData(String id) throws ActException {
        try {
            List<RoleVO> vos = BeanTransform.copyProperties(roleAPI.treeData(id),RoleVO.class);
            return ActResult.initialize(vos);
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 添加角色
     *
     * @param bo 新的角色信息
     * @return 持久化的角色信息
     * @throws ActException
     */
    @PostMapping("add")
    public ActResult add(RoleBO bo) throws ActException {
        try {
            return ActResult.initialize(roleAPI.saveByBO(bo));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 通过id删除角色(如该节点存在子节点,先删除子节点)
     *
     * @param id 角色唯一标示
     * @return
     * @throws ActException
     */
    @DeleteMapping("delete/{id}")
    public ActResult delete(@PathVariable String id) throws ActException {
        try {
            roleAPI.delete(id);
            return new ActResult("delete is success!");
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

}