package com.bjike.goddess.employeecontract.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.employeecontract.bo.ContractChangeBO;
import com.bjike.goddess.employeecontract.bo.ContractInfoBO;
import com.bjike.goddess.employeecontract.bo.ContractManageBO;
import com.bjike.goddess.employeecontract.bo.ContractPersonalBO;
import com.bjike.goddess.employeecontract.dto.ContractManageDTO;
import com.bjike.goddess.employeecontract.service.ContractManageSer;
import com.bjike.goddess.employeecontract.to.ContractChangeTO;
import com.bjike.goddess.employeecontract.to.ContractInfoTO;
import com.bjike.goddess.employeecontract.to.ContractManageTO;
import com.bjike.goddess.employeecontract.to.ContractPersonalTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 合同管理业务接口实现
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-04-21 04:04 ]
 * @Description: [ 合同管理业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("contractManageApiImpl")
public class ContractManageApiImpl implements ContractManageAPI {

    @Autowired
    private ContractManageSer contractManageSer;

    @Override
    public ContractManageBO save(ContractManageTO to) throws SerException {
        return contractManageSer.save(to);
    }

    @Override
    public ContractManageBO updateDetail(ContractManageTO to) throws SerException {
        return contractManageSer.updateDetail(to);
    }

    @Override
    public ContractInfoBO updateInfo(ContractInfoTO to) throws SerException {
        return contractManageSer.updateInfo(to);
    }

    @Override
    public ContractPersonalBO updatePersonal(ContractPersonalTO to) throws SerException {
        return contractManageSer.updatePersonal(to);
    }

    @Override
    public ContractInfoBO affirm(String id) throws SerException {
        return contractManageSer.affirm(id);
    }

    @Override
    public ContractManageBO delete(String id) throws SerException {
        return contractManageSer.delete(id);
    }

    @Override
    public ContractManageBO getById(String id) throws SerException {
        return contractManageSer.getById(id);
    }

    @Override
    public List<ContractPersonalBO> personalMaps(ContractManageDTO dto) throws SerException {
        return contractManageSer.personalMaps(dto);
    }

    @Override
    public List<ContractInfoBO> infoMaps(ContractManageDTO dto) throws SerException {
        return contractManageSer.infoMaps(dto);
    }

    @Override
    public Long getPersonalTotal() throws SerException {
        return contractManageSer.getPersonalTotal();
    }

    @Override
    public Long getInfoTotal() throws SerException {
        return contractManageSer.getInfoTotal();
    }

    @Override
    public List<ContractManageBO> findStatus() throws SerException {
        return contractManageSer.findStatus();
    }

    @Override
    public ContractChangeBO saveChange(ContractChangeTO to) throws SerException {
        return contractManageSer.saveChange(to);
    }
}