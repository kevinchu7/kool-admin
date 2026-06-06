package com.kool.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.kool")
@MapperScan("com.kool.**.mapper")
public class KoolAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(KoolAdminApplication.class, args);
    }
}
