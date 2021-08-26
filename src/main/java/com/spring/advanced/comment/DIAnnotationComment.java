package com.spring.advanced.comment;

import org.springframework.context.annotation.DeferredImportSelector;

public class DIAnnotationComment {

    /**
     * @Component: 递归去找内部类，让内部类再走一遍解析注解标签的全流程
     */

    /**
     * @Import： 对于通过Import导入的类有三种类型
     *      类型一：1)实现了{@link org.springframework.context.annotation.ImportSelector}接口
     *             的类，如果又实现了{@link org.springframework.context.annotation.DeferredImportSelector}
     *             接口，则需要从spring.handlers里再导入对应的一些类。
     *             2)如果没有实现第二个接口，则需要从spring内部的类里面获取需要再import的类，
     *             见{@link org.springframework.cache.annotation.EnableCaching},
     *               {@link org.springframework.scheduling.annotation.EnableAsync}中的model属性实现
     *
     *       类型二：实现了{@link org.springframework.context.annotation.ImportBeanDefinitionRegistrar}接口
     *       类型三：自己项目里普通的类：走一遍解析注解标签的全流程
     *
     *       类型一和类型二是为了Spring内部自用，或是提供给别人扩展的，会在这一步就会实例化import的类
     *       类型三是自己业务中为了导入项目中的普通类，只会在bean的生命周期中才去实例化
     *
     */

    /**
     * @ComponentScan
     */
}
