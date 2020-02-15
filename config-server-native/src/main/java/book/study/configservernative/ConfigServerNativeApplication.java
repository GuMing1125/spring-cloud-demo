package book.study.configservernative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 项目名称: spring-cloud-demo
 * 描述: [类型描述]
 * 创建时间: 2020-02-13
 *
 * @author YangHaiBo
 * @version v1.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerNativeApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerNativeApplication.class, args);
    }
}

/*
@EnableConfigServer
声明配置中心
 */
