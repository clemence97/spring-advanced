package com.spring.advanced.customEditor;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;



public class AnnotationConfigApplicationContextComment extends AnnotationConfigApplicationContext {

    /**
     * AnnotationConfigApplicationContext(String... basePackages)
     * 1. this()
     *      父类的构造方法中已创建了beanFactory
     *      已向BeanDefinitionRegister中注入了创建的beanFactory
     *      已将相关BeanDefinitionRegistryPostProcessor，BeanPostProcessor, BeanFactoryPostProcessor
     *      加载为BeanDefinition，注册到beanFactory中【其中ConfigurationClassPostProcessor是在这一步注入的】
     * 2. scan(basePackages)
     *      只扫描有 @Component的类 将其加载为beanDefinition并注册到beanFactory中
     *      注意：这里会给该beanDefinition做代理再加入beanFactory中
     * 3. refresh()
     */


    /**
     * ConfigurationClassPostProcessor
     */
}
