package com.ljw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liujunwu001
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication02 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication02.class,args);

    }
}
