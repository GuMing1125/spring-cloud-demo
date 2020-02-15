package book.study.zipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.internal.EnableZipkinServer;

/**
 * 项目名称: spring-cloud-demo
 * 描述: [类型描述]
 * 创建时间: 2020-02-15
 *
 * @author YangHaiBo
 * @version v1.0
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplication.class, args);
    }
}
