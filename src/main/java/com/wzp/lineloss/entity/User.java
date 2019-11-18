package com.wzp.lineloss.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author wzp
 * @date 2019-11-05 11:12
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String password;
    private Date birthday;
    private String sex;
    private String phone;
}
