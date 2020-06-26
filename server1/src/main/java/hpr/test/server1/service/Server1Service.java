package hpr.test.server1.service;

import hpr.test.server1.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author haopeiren
 * @since 2020/6/26
 */
@Service
//@Slf4j  其实这个@Slf4j注解  相当于  这样
public class Server1Service
{
    private static final Logger LOGGER = LoggerFactory.getLogger(Server1Service.class);

    public Student buildStudent(String name, Integer age) {
        LOGGER.info("my server in");
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        LOGGER.info("my server out");
        return student;
    }
}
