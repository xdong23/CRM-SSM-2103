package com.dong.settings.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author daDong
 * @version 1.0
 * @description
 * @date 2021-03-23-23:41
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private String id;
    private String loginAct;
    private String name;
    private String loginPwd;
    private String expireTime;
    private String lockState;
    private String deptno;
    private String allowIps;
    private String createTime;
    private String createBy;
    private String editTime;
    private String editBy;

}
