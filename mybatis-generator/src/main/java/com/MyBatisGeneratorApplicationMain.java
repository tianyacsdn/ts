package com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author tom
 * @date 2018-11-05
 */
@SpringBootApplication
public class MyBatisGeneratorApplicationMain {
    public static void main(String[] args) {
        new SpringApplicationBuilder(MyBatisGeneratorApplicationMain.class)
                .run(args);
    }
}
