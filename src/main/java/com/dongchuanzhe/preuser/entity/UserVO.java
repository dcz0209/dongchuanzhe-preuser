package com.dongchuanzhe.preuser.entity;

import lombok.Data;

@Data
public class UserVO extends User {

    private String provinceName;

    private String cityName;

    private String districtName;


    private String roleIds;

    private String roleNameZhs;
}
