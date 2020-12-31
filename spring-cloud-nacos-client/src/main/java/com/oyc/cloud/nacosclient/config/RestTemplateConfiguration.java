package com.oyc.cloud.nacosclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: RestTemplateConfiguration
 * @Description: RestTemplateConfiguration
 * @Author oyc
 * @Date 2020/12/31 10:01
 * @Version 1.0
 */
@Configuration
public class RestTemplateConfiguration {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
