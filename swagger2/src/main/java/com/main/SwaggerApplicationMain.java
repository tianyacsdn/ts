package com.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author tom
 * @date 2018-11-06
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.*")
public class SwaggerApplicationMain {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SwaggerApplicationMain.class).run(args);
    }
}
