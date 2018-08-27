package com.example.bookappointment.mapper;

import com.example.bookappointment.domain.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    /**
     * 向数据库验证输入的密码是否正确
     */
    Student quaryStudent(@Param("studentId") long studentId, @Param("password") long password);

}
