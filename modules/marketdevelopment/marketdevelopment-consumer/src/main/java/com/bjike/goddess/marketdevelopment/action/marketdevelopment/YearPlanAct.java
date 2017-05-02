package com.bjike.goddess.marketdevelopment.action.marketdevelopment;

import com.bjike.goddess.common.api.entity.ADD;
import com.bjike.goddess.common.api.entity.EDIT;
import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.marketdevelopment.api.YearPlanAPI;
import com.bjike.goddess.marketdevelopment.dto.YearPlanDTO;
import com.bjike.goddess.marketdevelopment.to.YearPlanTO;
import com.bjike.goddess.marketdevelopment.vo.YearPlanChoiceVO;
import com.bjike.goddess.marketdevelopment.vo.YearPlanVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 年计划
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-03-22 05:57 ]
 * @Description: [ 年计划 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("yearplan")
public class YearPlanAct {

    @Autowired
    private YearPlanAPI yearPlanAPI;

    /**
     * 保存年计划数据
     *
     * @param to 年计划传输对象
     * @return class YearPlanVO
     * @version v1
     */
    @PostMapping("v1/save")
    public Result save(@Validated(ADD.class) YearPlanTO to, BindingResult result, HttpServletRequest request) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(yearPlanAPI.save(to), YearPlanVO.class, request));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 修改年计划数据
     *
     * @param to 年计划传输对象
     * @return class YearPlanVO
     * @version v1
     */
    @PutMapping("v1/update/{id}")
    public Result update(@Validated(EDIT.class) YearPlanTO to, BindingResult result, HttpServletRequest request) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(yearPlanAPI.update(to), YearPlanVO.class, request));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 删除年计划对象
     *
     * @param to 年计划传输对象
     * @return class YearPlanVO
     * @version v1
     */
    @DeleteMapping("v1/delete/{id}")
    public Result delete(YearPlanTO to, HttpServletRequest request) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(yearPlanAPI.delete(to), YearPlanVO.class, request));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 查询本年年计划数据
     *
     * @return class YearPlanVO
     * @version v1
     */
    @GetMapping("v1/findThisYear")
    public Result findThisYear(HttpServletRequest request) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(yearPlanAPI.findThisYear(), YearPlanVO.class, request));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 根据年份查询年计划数据
     *
     * @param year 年份
     * @return class YearPlanVO
     * @version v1
     */
    @GetMapping("v1/findByYear")
    public Result findByYear(int year, HttpServletRequest request) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(yearPlanAPI.findByYear(year), YearPlanVO.class, request));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 根据id获取年计划
     *
     * @param id 年计划数据id
     * @return class YearPlanVO
     * @version v1
     */
    @GetMapping("v1/findById/{id}")
    public Result findById(@PathVariable String id, HttpServletRequest request) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(yearPlanAPI.getById(id), YearPlanVO.class, request));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }


    /**
     * 列表
     *
     * @param dto 年计划数据传输对象
     * @return class YearPlanVO
     * @version v1
     */
    @GetMapping("v1/maps")
    public Result maps(YearPlanDTO dto, HttpServletRequest request) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(yearPlanAPI.maps(dto), YearPlanVO.class, request));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 获取总条数
     *
     * @version v1
     */
    @GetMapping("v1/getTotal")
    public Result getTotal() throws ActException {
        try {
            return ActResult.initialize(yearPlanAPI.getTotal());
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 获取年计划选择对象
     *
     * @return class YearPlanChoiceVO
     * @version v1
     */
    @GetMapping("v1/getChoice")
    public Result getChoice(HttpServletRequest request) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(yearPlanAPI.getChoice(), YearPlanChoiceVO.class, request));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }


}