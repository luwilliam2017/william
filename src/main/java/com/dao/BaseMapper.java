package com.dao;

import com.bean.Person;
import com.bean.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by w on 2017/11/12.
 */
public interface BaseMapper {

    @Select("select * from person where username = #{name}")
    Person selectStateByName(@Param("name") String name);

    @Select("select * from person ")
    List<Person> selectAllPerson();

    @Delete("delete from person where id = #{id}")
    int deletePerson(@Param("id")Integer id);


//    List<Student> selectAll();

}
