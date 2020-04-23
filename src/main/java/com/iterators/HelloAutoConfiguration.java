package com.iterators;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author iterators
 * @time 2020.04.23
 */
@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

    @ConditionalOnWebApplication
    @Bean
    public HelloRunner helloRunner(HelloProperties helloProperties) {
        return new HelloRunner(helloProperties);
    }
}
