package book.study.hystrix.client.impl;

import book.study.hystrix.client.FeignProviderClient;
import book.study.hystrix.entity.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * 项目名称: spring-cloud-demo
 * 描述: [类型描述]
 * 创建时间: 2020-02-13
 *
 * @author YangHaiBo
 * @version v1.0
 */
@Component
public class FeignProviderError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中......";
    }
}
