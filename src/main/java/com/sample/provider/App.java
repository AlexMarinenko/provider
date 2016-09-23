package com.sample.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.UnsupportedEncodingException;

@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
public class App {
    public static void main(String[] args) throws UnsupportedEncodingException {
        ApplicationContext ctx = SpringApplication.run(App.class, args);
        IConverter converter = ctx.getBean(IConverter.class);
        String result = converter.convert("test string");
        System.out.println(result);
    }
}
