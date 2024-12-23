package com.yky.storagebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.yky.storagebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class StorageBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorageBackendApplication.class, args);
    }

}
