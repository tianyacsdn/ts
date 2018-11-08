package com.annotation;

import org.junit.Test;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.StringUtils;

/**
 * @author tom
 * @date 2018-11-08
 */
//value和locations必须相同，否则报错
@ContextConfiguration(value = "aa.xml", locations = "aa.xml")
public class AnnotationUtilsTest {
    @Test
    public void testAliasfor() {
        ContextConfiguration cc = AnnotationUtils.findAnnotation(getClass(),
                ContextConfiguration.class);
        System.out.println(
                StringUtils.arrayToCommaDelimitedString(cc.locations()));
        System.out.println(StringUtils.arrayToCommaDelimitedString(cc.value()));
    }
}
