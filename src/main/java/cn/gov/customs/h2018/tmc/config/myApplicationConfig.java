package cn.gov.customs.h2018.tmc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.gov.customs.h2018.tmc.service.HellowordService;

@Configuration
public class myApplicationConfig {
@Bean
public HellowordService open() {
	return new HellowordService();
}

}
