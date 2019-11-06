package com.wzp.lineloss.mapper;

import com.wzp.lineloss.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author wzp
 * @date 2019-11-05 11:15
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user(username,password,birthday,sex) values (${username},${password},${birthday},${sex})")
    void insert(User user);
    @Select("select * from where id = ${id}")
    void selectById(Integer id);
}
