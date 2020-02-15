package book.study.eurekaserver.eurekaprovider.repository;

import book.study.eurekaserver.eurekaprovider.entity.Student;

import java.util.Collection;

/**
 * 项目名称: spring-cloud-demo
 * 描述: [类型描述]
 * 创建时间: 2020-02-13
 *
 * @author YangHaiBo
 * @version v1.0
 */
public interface StudentRepository {
    public Collection<Student> findALl();

    public Student findById(long id);

    public void saveOrUpdate(Student student);

    public void deleteById(long id);
}
