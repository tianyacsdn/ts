package com.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author tom
 * @date 2018-11-08
 * GroovyOrXmlTestConfig把 @MyTestConfig（参考上一个案例）作为元注解
 * 定义了groovy属性，并作为MyTestConfig中的groovyScripts属性的别名
 * 定义了xml属性，并作为ContextConfiguration中的locations属性的别名
 * 因为MyTestConfig中的groovyScripts属性本身就是ContextConfiguration中的locations属性的别名；所以xml属性和groovy属性也互为别名；
 * 这个就是别名的传递性
 */
@MyTestConfig
public @interface GroovyOrXmlTestConfig {
    @AliasFor(annotation = MyTestConfig.class, attribute = "groovyScripts")
    String[] groovy() default {};

    @AliasFor(annotation = ContextConfiguration.class, attribute = "locations")
    String[] xml() default {};
}
