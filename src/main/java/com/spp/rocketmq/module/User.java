package com.spp.rocketmq.module;

import java.io.Serializable;

/**
 * @author 01542955（supeipei）
 * @date 2019/2/21 17:41
 * @Description: 实体类
 */
public class User implements Serializable {

    private String loginName;
    private String pwd;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }


}
