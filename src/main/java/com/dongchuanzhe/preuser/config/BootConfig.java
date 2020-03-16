package com.dongchuanzhe.preuser.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan("com.dongchuanzhe.preuser.mapper")
public class BootConfig {
    // 配置原生servlet
    /*@Bean
    public ServletRegistrationBean getservlet(){
        ServletRegistrationBean<TestServlet>  se = new ServletRegistrationBean<>(new TestServlet());
        se.addUrlMappings("/test1");
        return se;
    }*/
    //如果es与redis整合后出现bug，请放开此注释试试结果,一般在测试时出现
    /*@PostConstruct
    void init() {
        System.setProperty("es.set.netty.runtime.available.processors", "false");
    }*/
    //分页拦截器配置
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}