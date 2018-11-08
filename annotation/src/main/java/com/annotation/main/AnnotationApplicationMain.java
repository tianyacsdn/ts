package com.annotation.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author tom
 * @date 2018-11-08
 */
@SpringBootApplication
@ComponentScan(value = "com.*")
public class AnnotationApplicationMain {
    public static void main(String[] args) {
        new SpringApplicationBuilder(AnnotationApplicationMain.class).run(args);
    }
}
