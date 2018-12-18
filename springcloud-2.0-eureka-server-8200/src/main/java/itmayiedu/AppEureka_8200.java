package itmayiedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author laowang
 * @date 2018/11/30 6:42 PM
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class AppEureka_8200 {

    public static void main(String[] args) {
        /**
         * @EnableEurekaServer 表示开始注册中心
         */
        SpringApplication.run(AppEureka_8200.class,args);
    }
}
