package com.vottun.sdk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SdkConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

