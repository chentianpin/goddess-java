package com.bjike.goddess.marketdevelopment.service;

import com.bjike.goddess.common.api.dto.Restrict;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.type.Status;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.marketdevelopment.bo.BusinessTypeBO;
import com.bjike.goddess.marketdevelopment.dto.BusinessTypeDTO;
import com.bjike.goddess.marketdevelopment.entity.BusinessType;
import com.bjike.goddess.marketdevelopment.to.BusinessTypeTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 业务类型业务实现
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-03-22 07:20 ]
 * @Description: [ 业务类型业务实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@CacheConfig(cacheNames = "marketdevelopmentSerCache")
@Service
public class BusinessTypeSerImpl extends ServiceImpl<BusinessType, BusinessTypeDTO> implements BusinessTypeSer {


    @Transactional(rollbackFor = SerException.class)
    @Override
    public BusinessTypeBO save(BusinessTypeTO to) throws SerException {
        BusinessType entity = BeanTransform.copyProperties(to, BusinessType.class);
        entity.setStatus(Status.THAW);
        super.save(entity);
        return BeanTransform.copyProperties(entity, BusinessTypeBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public BusinessTypeBO update(BusinessTypeTO to) throws SerException {
        if (StringUtils.isNotBlank(to.getId())) {
            try {
                BusinessType entity = super.findById(to.getId());
                BeanTransform.copyProperties(to, entity, true);
                entity.setModifyTime(LocalDateTime.now());
                super.update(entity);
                return BeanTransform.copyProperties(entity, BusinessTypeBO.class);
            } catch (Exception e) {
                throw new SerException("数据对象不能为空");
            }
        } else
            throw new SerException("数据ID不能为空");
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public BusinessTypeBO congeal(BusinessTypeTO to) throws SerException {
        BusinessType entity = super.findById(to.getId());
        if (null == entity)
            throw new SerException("数据对象不能为空");
        entity.setStatus(Status.CONGEAL);
        super.update(entity);
        return BeanTransform.copyProperties(entity, BusinessTypeBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public BusinessTypeBO thaw(BusinessTypeTO to) throws SerException {
        BusinessType entity = super.findById(to.getId());
        if (null == entity)
            throw new SerException("数据对象不能为空");
        entity.setStatus(Status.THAW);
        super.update(entity);
        return BeanTransform.copyProperties(entity, BusinessTypeBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public BusinessTypeBO delete(BusinessTypeTO to) throws SerException {
        BusinessType entity = super.findById(to.getId());
        if (entity == null)
            throw new SerException("数据对象不能为空");
        try {
            super.remove(entity);
        } catch (SerException e) {
            throw new SerException("存在依赖关系无法删除");
        }
        return BeanTransform.copyProperties(entity, BusinessTypeBO.class);
    }

    @Override
    public List<BusinessTypeBO> findThaw() throws SerException {
        BusinessTypeDTO dto = new BusinessTypeDTO();
        dto.getConditions().add(Restrict.eq(STATUS, Status.THAW));
        List<BusinessType> list = super.findByCis(dto);
        return BeanTransform.copyProperties(list, BusinessTypeBO.class);
    }
}