//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.kyle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.kyle.mapper")
@SpringBootApplication
public class MainApplication {
    public MainApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
