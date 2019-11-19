package com.wzp.lineloss.service.impl;

import com.wzp.lineloss.entity.Node;
import com.wzp.lineloss.mapper.NodeMapper;
import com.wzp.lineloss.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wzp
 * @date 2019-11-19 14:35
 */
@Service
public class NodeServiceImpl implements NodeService {
    @Autowired
    private NodeMapper nodeMapper;

    /**
     * 所有的
     */
    @Override
    public List<Node> findAll() {
        List<Node> list = nodeMapper.selectAll();
        return list;
    }

    /**
     * Ztree读取的
     */
    @Override
    public List<Node> findAllNode() {
        List<Node> list = nodeMapper.findAllNode();
        return list;
    }

    /**
     * 每个人对应的
     */
    @Override
    public List<Node> findAllMyNode(Integer id) {
        List<Node> list = nodeMapper.findAllMyNode(id);
        return list;
    }
}
