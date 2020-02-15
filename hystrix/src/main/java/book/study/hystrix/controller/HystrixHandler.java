package book.study.hystrix.controller;

import book.study.hystrix.client.FeignProviderClient;
import book.study.hystrix.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * 项目名称: spring-cloud-demo
 * 描述: [类型描述]
 * 创建时间: 2020-02-13
 *
 * @author YangHaiBo
 * @version v1.0
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {
    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index() {
        return feignProviderClient.index();
    }

}
