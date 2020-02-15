package book.study.zipkinclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称: spring-cloud-demo
 * 描述: [类型描述]
 * 创建时间: 2020-02-15
 *
 * @author YangHaiBo
 * @version v1.0
 */
@RestController
@RequestMapping("/zipkin")
public class ZipkinHandler {
    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index() {
        return this.port;
    }
}
