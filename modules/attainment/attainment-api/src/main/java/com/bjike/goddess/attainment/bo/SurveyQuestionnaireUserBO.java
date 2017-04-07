package com.bjike.goddess.attainment.bo;

import com.bjike.goddess.common.api.bo.BaseBO;

/**
 * 问卷调查历史记录业务传输对象
 *
 * @Author: [ dengjunren ]
 * @Date: [ 2017-04-06 11:31 ]
 * @Description: [ 问卷调查历史记录业务传输对象 ]
 * @Version: [ v1.0.0 ]
 * @Copy: [ com.bjike ]
 */
public class SurveyQuestionnaireUserBO extends BaseBO {

    /**
     * 调研实施id
     */
    private String actualize_id;

    /**
     * 问卷
     */
    private String questionnaireName;

    /**
     * 用户
     */
    private String user;


    public String getActualize_id() {
        return actualize_id;
    }

    public void setActualize_id(String actualize_id) {
        this.actualize_id = actualize_id;
    }

    public String getQuestionnaireName() {
        return questionnaireName;
    }

    public void setQuestionnaireName(String questionnaireName) {
        this.questionnaireName = questionnaireName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}