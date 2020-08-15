package org.sharon.springboot.config;

import com.alibaba.druid.support.http.StatViewServlet;
import org.sharon.springboot.component.LoginHandlerInterceptor;
import org.sharon.springboot.component.MyLocaleResolver;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sharon
 * @create 2020-08-12-11:03
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    //设视图解析器
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/sharon").setViewName("success");
    }

    //设置页面拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> patterns = new ArrayList<>();
        patterns.add("/");
        patterns.add("/index");
        patterns.add("/index.html");
        patterns.add("/user/login");
        patterns.add("/webjars/**");
        patterns.add("/asserts/**");
        patterns.add("/dept/**");
        patterns.add("/emp/**");
        patterns.add("/user/**");
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns(patterns);
    }

    //设视图解析器
    @Bean
    public WebMvcConfigurer webMvcConfigurerImpl(){
        return new WebMvcConfigurer(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/dashboard.html").setViewName("dashboard");
            }
        };
    }

    //设置地区信息解析器
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
