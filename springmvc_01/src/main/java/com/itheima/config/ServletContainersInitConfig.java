package com.itheima.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {

    //设置扫描SpringMvc配置参数
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    //设置所有请求都SpringMVC拦截，并进行处理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
   // 加载spring 配置
    @Override
    protected WebApplicationContext createRootApplicationContext() {
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(SpringConfig.class);
        return null;
    }
}
