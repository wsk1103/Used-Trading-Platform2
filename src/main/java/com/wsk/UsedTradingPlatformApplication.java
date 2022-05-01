package com.wsk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author sk
 * @date 2022/5/1
 * @description 描述
 */
@SpringBootApplication
@EntityScan(basePackages = "com.wsk.*")
@ComponentScan({"com.wsk.*"})
@MapperScan({"com.wsk.dao"}) //扫描mybatis，需注解 @Repository
@EnableAsync
public class UsedTradingPlatformApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(UsedTradingPlatformApplication.class).run(args);
    }

}
