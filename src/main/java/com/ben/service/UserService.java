package com.ben.service;

import com.ben.pojo.Student;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
List<Student>getStudentList();
}
