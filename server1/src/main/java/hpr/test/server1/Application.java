package hpr.test.server1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目启动类，项目集成了tomcat  可以直接执行启动类的main方法 启动web
 *
 * @author haopeiren
 * @since 2020/6/26
 */
@SpringBootApplication//启动注解
public class Application
{
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
}
