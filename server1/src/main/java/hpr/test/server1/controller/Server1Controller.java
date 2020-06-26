package hpr.test.server1.controller;

import hpr.test.server1.model.Student;
import hpr.test.server1.service.Server1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo controller
 *
 * @author haopeiren
 * @since 2020/6/26
 */
@RestController // == controller + responseBody
@Slf4j
public class Server1Controller
{
    @Autowired
    private Server1Service service;//上面那个auwowire 其实相当于 吧spring里面 创建好的那个对象 给你赋值到这里来 跟下面那个很像
        //只不过对象是在spring里面的 ， 那么问题来了  spring里面的这个对象那里来的
    //被@Controller @Service @Repository @Component修饰的类   spring会创建一个类的对象放在spring容器中
    //spring你就理解成一个大的map 里面杂七杂八放了好多东西 好多对象  刚才我创建的service加了@Service注解  spring会创建一个我的那个
    //service 放在map里   然后我使用autowire的时候 他会给我在容器里面  按类的类型找到  赋值在这里


    @GetMapping(value = "/server1/test")
    public String test() {
        return "hello world";
    }


    @GetMapping(value = "/server1/get/test")
    public Student getTest(Integer age, String name) {
        log.info("get student name:{}, age:{}", name, age);
        Student student = service.buildStudent(name, age);
        log.info("get student success");
        return student;
    }

    @GetMapping(value = "/server1/get/test2")
    public Student getTest2(Student student) {
        log.info("get student name:{}, age:{}", student.getName(), student.getAge());
        log.info("get student success");
        return student;
    }

    @PostMapping(value = "/server1/post/test")
    public Student postTest(@RequestBody Student student) {
        log.info("get student name:{}, age:{}", student.getName(), student.getAge());
        log.info("get student success");
        return student;
    }
}
