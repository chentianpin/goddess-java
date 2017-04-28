package com.bjike.goddess.organize.service;

import com.bjike.goddess.common.api.dto.Restrict;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.type.Status;
import com.bjike.goddess.common.jpa.service.ServiceImpl;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.organize.bo.ReflectBO;
import com.bjike.goddess.organize.dto.ReflectDTO;
import com.bjike.goddess.organize.entity.Reflect;
import com.bjike.goddess.organize.to.ReflectTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 体现类型操作业务实现
 *
 * @Author: [dengjunren]
 * @Date: [17-3-8 上午11:29]
 * @Description: []
 * @Version: [1.0.0]
 * @Copy: [com.bjike.goddess.organize.entity]
 */
@Service
public class ReflectSerImpl extends ServiceImpl<Reflect, ReflectDTO> implements ReflectSer {


    @Override
    public List<ReflectBO> findStatus() throws SerException {
        ReflectDTO dto = new ReflectDTO();
        dto.getConditions().add(Restrict.eq(STATUS, Status.THAW));
        return BeanTransform.copyProperties(super.findByCis(dto), ReflectBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public ReflectBO save(ReflectTO to) throws SerException {
        Reflect reflect = BeanTransform.copyProperties(to, Reflect.class);
        reflect.setCreateTime(LocalDateTime.now());
        reflect.setStatus(Status.THAW);
        super.save(reflect);
        return BeanTransform.copyProperties(reflect, ReflectBO.class);
    }

    @Transactional(rollbackFor = SerException.class)
    @Override
    public ReflectBO update(ReflectTO to) throws SerException {
        if (StringUtils.isBlank(to.getId()))
            throw new SerException("数据ID不能为空");
        Reflect entity = super.findById(to.getId());
        if (entity == null)
            throw new SerException("数据对象不能为空");
        BeanTransform.copyProperties(to, entity, true);
        entity.setModifyTime(LocalDateTime.now());
        super.update(entity);
        return BeanTransform.copyProperties(entity, ReflectBO.class);
    }

    @Override
    public ReflectBO delete(String id) throws SerException {
        Reflect entity = super.findById(id);
        if (entity == null)
            throw new SerException("数据对象不能为空");
        try {
            super.remove(entity);
        } catch (SerException e) {
            throw new SerException("存在依赖关系无法删除");
        }
        return BeanTransform.copyProperties(entity, ReflectBO.class);
    }

    @Override
    public ReflectBO close(String id) throws SerException {
        Reflect entity = super.findById(id);
        if (entity == null)
            throw new SerException("数据对象不能为空");
        entity.setStatus(Status.CONGEAL);
        super.update(entity);
        return BeanTransform.copyProperties(entity, ReflectBO.class);
    }

    @Override
    public ReflectBO open(String id) throws SerException {
        Reflect entity = super.findById(id);
        if (entity == null)
            throw new SerException("数据对象不能为空");
        entity.setStatus(Status.THAW);
        super.update(entity);
        return BeanTransform.copyProperties(entity, ReflectBO.class);
    }

    @Override
    public List<ReflectBO> maps(ReflectDTO dto) throws SerException {
        dto.getSorts().add("status=asc");
        return BeanTransform.copyProperties(super.findByPage(dto), ReflectBO.class);
    }
}
