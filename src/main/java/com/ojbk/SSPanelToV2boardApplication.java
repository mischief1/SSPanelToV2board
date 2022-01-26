package com.ojbk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan("com.ojbk.mappers")
public class SSPanelToV2boardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SSPanelToV2boardApplication.class, args);
    }

}
