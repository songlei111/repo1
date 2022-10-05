package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/*
*  springmvc 加载表现层bean（controll层bean）
*  spring 控制的bean  业务bean（server层）、功能bean（DataSource dao 层）
*  如果遇到冲突可用以下方式进行处理
*  扫描多个bean配置时，如方式1,
*  //@ComponentScan({"com.itheima.controller","com.itheima.servers","com.itheima.dao"})
*  方式2 排除不需要扫描的bean，type：按照注解方式排除
*  @ComponentScan(value = "com.itheima",excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class))
*/

@Configuration
@ComponentScan("com.itheima.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
