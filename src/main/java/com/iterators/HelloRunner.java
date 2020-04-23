package com.iterators;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

/**
 * @author iterators
 * @time 2020.04.23
 */
public class HelloRunner implements ApplicationRunner {

    private HelloProperties helloProperties;

    public HelloRunner(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public void run(ApplicationArguments args) throws Exception {
        System.out.println("auto hello from author: " + helloProperties.getName());
    }
}
