package com.wzp.lineloss.mapper;

import com.wzp.lineloss.entity.Node;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author wzp
 * @date 2019-11-19 14:33
 */
@Mapper
public interface NodeMapper extends tk.mybatis.mapper.common.Mapper<Node> {
    @Select("select id ,name ,parent_id from node")
    List<Node> findAllNode();

    @Select("SELECT DISTINCT n.* from node n, USER u INNER JOIN role_user ru ON u.id = ru.uid LEFT JOIN role r ON ru.id = r.ruid where n.id=r.nid and u.id=#{id}")
    List<Node> findAllMyNode(Integer id);
}
