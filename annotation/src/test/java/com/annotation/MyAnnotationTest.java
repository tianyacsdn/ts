package com.annotation;

import com.annotation.custom.MyAnnotation;
import org.junit.Test;
import org.springframework.core.annotation.AnnotationUtils;

/**
 * @author tom
 * @date 2018-11-08
 */
@MyAnnotation(value = "aa", alias = "bb")
public class MyAnnotationTest {

    @Test
    public void testAliasfor2() {
        MyAnnotation myAnnotation = getClass().getAnnotation(MyAnnotation.class);
        System.out.println(myAnnotation.value());
        System.out.println(myAnnotation.alias());
    }

    @Test
    public void testAliasfor3() {
        MyAnnotation ann = AnnotationUtils.findAnnotation(getClass(),
                MyAnnotation.class);
        System.out.println(ann.value());
        System.out.println(ann.alias());
    }

}
