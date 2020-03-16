package com.dongchuanzhe.preuser.entity;

import lombok.Data;

import java.util.List;
@Data
public class MenuVO extends Menu {

    private List<Menu> menus;
}
