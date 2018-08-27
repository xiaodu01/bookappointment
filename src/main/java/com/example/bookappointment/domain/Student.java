package com.example.bookappointment.domain;

public class Student {

    private Long studentId; // 学生ID
    private Long password; // 密码

    public Long getStudentId() {
        return studentId;
    }
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
    public Long getPassword() {
        return password;
    }
    public void setPassword(Long password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", password=" + password + "]";
    }
}
