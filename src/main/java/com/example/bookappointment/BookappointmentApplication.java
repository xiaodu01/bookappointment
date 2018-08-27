package com.example.bookappointment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.bookappointment.mapper")
public class BookappointmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookappointmentApplication.class, args);
    }

}

