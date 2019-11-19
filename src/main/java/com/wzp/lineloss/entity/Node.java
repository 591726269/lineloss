package com.wzp.lineloss.entity;

import lombok.Data;

/**
 * @author wzp
 * @date 2019-11-19 14:31
 */
@Data
public class Node {
    private Integer id;
    private String name;
    private String icon;
    private String url;
    private String part;
    private String parentId;
}
