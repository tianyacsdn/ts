package com.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author tom
 * @date 2018-11-08
 * value，groovyScripts，xmlFiles都定义了别名@AliasFor(annotation = ContextConfiguration.class, attribute = "locations")，所以，其实在这个注解中，value、groovyScripts和xmlFiles也互为别名，这个就是所谓的在统一注解中的隐式别名方式
 */
@ContextConfiguration
public @interface MyTestConfig {
    @AliasFor(annotation = ContextConfiguration.class, attribute = "locations")
    String[] value() default {};

    @AliasFor(annotation = ContextConfiguration.class, attribute = "locations")
    String[] groovyScripts() default {};

    @AliasFor(annotation = ContextConfiguration.class, attribute = "locations")
    String[] xmlFiles() default {};
}
