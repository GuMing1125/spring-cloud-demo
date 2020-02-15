package book.study.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 项目名称: spring-cloud-demo
 * 描述: [类型描述]
 * 创建时间: 2020-02-13
 *
 * @author YangHaiBo
 * @version v1.0
 */
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
/*
@EnableZuulProxy
包含了@EnableZuulServer,设置该类为网关的启动类

@EnableAutoConfiguration
可以帮助Spring Boot应用将所有符合条件的 @Configuration 配置
加载到当前Spring Boot创建并使用的IoC容器中
 */