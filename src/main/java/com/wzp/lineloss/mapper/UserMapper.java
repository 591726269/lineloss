package com.wzp.lineloss.mapper;

import com.wzp.lineloss.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;



/**
 * @author wzp
 * @date 2019-11-05 11:15
 */
@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User> {
    @Select("select * from user where id = #{id}")
    User findUserById(Integer id);

}
