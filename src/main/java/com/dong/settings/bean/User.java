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
    private String id;//编号
    private String loginAct;//登陆账号
    private String name;//真实姓名
    private String loginPwd;//登陆密码
    private String expireTime;//失效时间
    private String lockState;//锁定状态
    private String deptno;//部门编号
    private String allowIps;//允许访问的ip地址
    private String createTime;//创建时间  19位字符串
    private String createBy;//创建人
    private String editTime;//修改时间 19
    private String editBy;//修改人

}
