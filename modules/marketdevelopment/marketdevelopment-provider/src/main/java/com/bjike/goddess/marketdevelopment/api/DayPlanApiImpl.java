package com.bjike.goddess.marketdevelopment.api;

import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.marketdevelopment.bo.DayPlanBO;
import com.bjike.goddess.marketdevelopment.service.DayPlanSer;
import com.bjike.goddess.marketdevelopment.to.DayPlanTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 天计划业务接口实现
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-03-22 07:08 ]
 * @Description: [ 天计划业务接口实现 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@Service("dayPlanApiImpl")
public class DayPlanApiImpl implements DayPlanAPI {

    @Autowired
    private DayPlanSer dayPlanSer;

    @Override
    public DayPlanBO save(DayPlanTO to) throws SerException {
        return dayPlanSer.save(to);
    }

    @Override
    public DayPlanBO update(DayPlanTO to) throws SerException {
        return dayPlanSer.update(to);
    }

    @Override
    public DayPlanBO delete(DayPlanTO to) throws SerException {
        return dayPlanSer.delete(to);
    }

    @Override
    public List<DayPlanBO> findByDate(String start, String end) throws SerException {
        return dayPlanSer.findByDate(start, end);
    }

    @Override
    public List<DayPlanBO> findByDate(String date) throws SerException {
        return dayPlanSer.findByDate(date);
    }
}