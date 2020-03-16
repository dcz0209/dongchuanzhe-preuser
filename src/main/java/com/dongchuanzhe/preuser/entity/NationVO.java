package com.dongchuanzhe.preuser.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class NationVO implements Serializable {

    private Integer value;

    private String label;

    private List<NationVO> children;

}
