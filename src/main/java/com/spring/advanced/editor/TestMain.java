package com.spring.advanced.editor;

import com.spring.advanced.domain.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {


    /**
     * 向spring内的类设置某些属性（属性上没有加 @Autowired 或 @Resource, 所以不能通过 @Component去进行属性注入）
     * 1. 通过在合适的地方调用spring类提供的设置该属性的接口实现
     * 2. 通过重写spring提供的对beanFactory属性扩展的接口实现
     *    customizeBeanFactory（在ClassPathXmlApplicationContext继承了AbstractRefreshableApplicationContext
     *    所以有该方法，AnnotationConfigApplicationContext没有该方法）
     * 2. 通过applicationContext.xml里向bean中加属性
     * 3. 通过@Configuration 和 @Bean 提前创建spring内的这个类，并向其设置具体属性值，
     *    这种方式可以将创建好的类交予spring容器管理
     * @param args
     */
    public static void main(String[]args){
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.spring.demo");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("selfEditor.xml");

        Student bean = context.getBean(Student.class);
        System.out.println(bean);
    }


}
