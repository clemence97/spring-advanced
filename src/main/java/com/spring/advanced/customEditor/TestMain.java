package com.spring.advanced.customEditor;

import com.spring.advanced.domain.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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


    /**
     * 对象创建有感
     * 1. 自己new出来的，不让Spring管理，spring是不会知道这个对象的存在的
     * 2. 注解或xml格式创建出来的对象是由spring管理的
     * @param args
     */

    /**
     * spring设计流程有感
     * 1. 对于xml格式来说：
     *      一个自定义标签对应一个处理器Handler，标签内的元素对应不同的解析器Parser,
     *      解析器会将所涉及的bean信息解析为beanDefinition注入beanFactory中，也会向beanFactory中
     *      注入相关的PostProcessor的BeanDefinition， 以待后面统一进行方法调用
     * @param args
     */
    public static void main(String[]args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.spring.advanced");
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("customEditor.xml");

        Student bean = context.getBean(Student.class);
        System.out.println(bean);
    }


}
