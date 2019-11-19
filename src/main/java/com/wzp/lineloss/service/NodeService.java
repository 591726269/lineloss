package com.wzp.lineloss.service;

import com.wzp.lineloss.entity.Node;

import java.util.List;

/**
 * @author wzp
 * @date 2019-11-19 14:34
 */
public interface NodeService {
    List<Node> findAll();

    List<Node> findAllNode();

    List<Node> findAllMyNode(Integer id);
}
