package com.answercloud.demo;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(scanBasePackages = {"com.answercloud.demo"})
@EnableDiscoveryClient
@ImportResource({"classpath:spring-mybatis.xml"})
//@MapperScan("com.answercloud.demo.mapper")
@EnableSwagger2Doc
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
