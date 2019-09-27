package com.vishwanath.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.vishwanath")
public class WebConfig {
    public static final String RESOLVE_PREFIX = "/WEB-INF/view/";
    public static final String RESOLVE_SUFFIX = ".jsp";

    // == bean methods ==
    @Bean
    public ViewResolver viewResolver(){
        UrlBasedViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix(RESOLVE_PREFIX);
        viewResolver.setSuffix(RESOLVE_SUFFIX);
        return viewResolver;
    }
}
