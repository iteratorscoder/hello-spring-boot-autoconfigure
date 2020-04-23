package com.iterators;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author iterators
 * @time 2020.04.23
 */
@ConfigurationProperties(prefix = "iterators")
public class HelloProperties {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
