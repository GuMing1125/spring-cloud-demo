package book.study.eurekaserver.eurekaprovider.repository.impl;

import book.study.eurekaserver.eurekaprovider.entity.Student;
import book.study.eurekaserver.eurekaprovider.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 项目名称: spring-cloud-demo
 * 描述: [类型描述]
 * 创建时间: 2020-02-13
 *
 * @author YangHaiBo
 * @version v1.0
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "张三", 12));
        studentMap.put(2L, new Student(1L, "李四", 22));
        studentMap.put(3L, new Student(1L, "王五", 16));
        studentMap.put(4L, new Student(1L, "赵六", 18));
        studentMap.put(5L, new Student(1L, "赵奇", 19));
    }

    @Override
    public Collection<Student> findALl() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
