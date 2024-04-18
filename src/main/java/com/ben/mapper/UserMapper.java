package com.ben.mapper;

import com.ben.pojo.Account;
import com.ben.pojo.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user where username = #{username}")
    Account findUserByName(String username);
    @Select("select * from student")
    List<Student>getStudentList();
}
