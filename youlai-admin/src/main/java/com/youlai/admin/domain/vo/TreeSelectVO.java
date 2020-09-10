package com.youlai.admin.domain.vo;


import lombok.Data;

import java.util.List;

@Data
public class TreeSelectVO {

    private Integer id;

    private String label;

    private List<TreeSelectVO> children;

}
