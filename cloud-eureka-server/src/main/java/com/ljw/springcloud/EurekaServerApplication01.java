package com.ljw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liujunwu001
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication01 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication01.class,args);
    }
}
