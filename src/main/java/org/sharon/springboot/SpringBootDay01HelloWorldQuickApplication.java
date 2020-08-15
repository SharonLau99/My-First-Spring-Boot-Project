package org.sharon.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "org.sharon.springboot.mapper")
@SpringBootApplication
public class SpringBootDay01HelloWorldQuickApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDay01HelloWorldQuickApplication.class, args);
    }

}
