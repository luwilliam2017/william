package com.demo.logdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试url
 * http://localhost:8012/
 * http://localhost:8012/hello/素文宅博客
 */
@RestController
public class HelloController {
    protected static Logger logger=LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    public String helloworld(){
        logger.debug("访问hello");
        return "Hello world!";
    }

    @RequestMapping("/hello/{name}")
    public String helloName(@PathVariable String name){
        logger.debug("访问 helloName,Name={}",name);
        return "Hello "+name;
    }
}
