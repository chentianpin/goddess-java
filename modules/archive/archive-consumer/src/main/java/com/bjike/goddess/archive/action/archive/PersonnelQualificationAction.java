package com.bjike.goddess.archive.action.archive;

import com.alibaba.dubbo.rpc.RpcContext;
import com.bjike.goddess.archive.api.PersonnelQualificationAPI;
import com.bjike.goddess.archive.dto.PersonnelQualificationDTO;
import com.bjike.goddess.archive.to.PersonnelQualificationTO;
import com.bjike.goddess.archive.vo.PersonnelQualificationVO;
import com.bjike.goddess.common.api.exception.ActException;
import com.bjike.goddess.common.api.exception.SerException;
import com.bjike.goddess.common.api.restful.Result;
import com.bjike.goddess.common.consumer.restful.ActResult;
import com.bjike.goddess.common.utils.bean.BeanTransform;
import com.bjike.goddess.storage.api.FileAPI;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 人员资质
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-04-12 04:01 ]
 * @Description: [ 人员资质 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
@RestController
@RequestMapping("personnelqualification")
public class PersonnelQualificationAction {

    @Autowired
    private PersonnelQualificationAPI personnelQualificationAPI;
    @Autowired
    private FileAPI fileAPI;

    /**
     * 保存
     *
     * @param to 人员资质传输对象
     * @return class PersonnelQualificationVO
     * @version v1
     */
    @PostMapping("v1/save")
    public Result save(PersonnelQualificationTO to) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(personnelQualificationAPI.save(to), PersonnelQualificationVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 修改
     *
     * @param to 人员资质传输对象
     * @return class PersonnelQualificationVO
     * @version v1
     */
    @PutMapping("v1/update/{id}")
    public Result update(PersonnelQualificationTO to) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(personnelQualificationAPI.update(to), PersonnelQualificationVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 删除
     *
     * @param id 人员资质数据id
     * @return class PersonnelQualificationVO
     * @version v1
     */
    @DeleteMapping("v1/delete/{id}")
    public Result delete(String id) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(personnelQualificationAPI.delete(id), PersonnelQualificationVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 列表
     *
     * @param dto 人员资质数据传输对象
     * @return class PersonnelQualificationVO
     * @version v1
     */
    @GetMapping("v1/maps")
    public Result maps(PersonnelQualificationDTO dto) throws ActException {
        try {
            return ActResult.initialize(BeanTransform.copyProperties(personnelQualificationAPI.maps(dto), PersonnelQualificationVO.class));
        } catch (SerException e) {
            throw new ActException(e.getMessage());
        }
    }

    /**
     * 上传附件
     *
     * @param request  上传请求
     * @param username 人员资质姓名(创建对应文件夹使用)
     * @return
     * @version v1
     */
    @PostMapping("v1/uploadEnclosure/{username}")
    public Result uploadEnclosure(HttpServletRequest request, @PathVariable String username) throws ActException {
        try {
            Object o = RpcContext.getContext().getAttachment("storageToken");

            String path = "/" + username;
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            List<MultipartFile> multipartFiles = multiRequest.getFiles("file");
            Map<String, byte[]> map = new HashMap<>(multipartFiles.size());

            for (MultipartFile multipartFile : multipartFiles) {
                byte[] bytes = IOUtils.toByteArray(multipartFile.getInputStream());
                map.put(multipartFile.getOriginalFilename(), bytes);
            }
            fileAPI.upload(map, path);
            return new ActResult("上传成功");
        } catch (Exception e) {
            throw new ActException(e.getMessage());
        }
    }

}