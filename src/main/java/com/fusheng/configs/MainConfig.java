package com.fusheng.configs;

import com.fusheng.models.Person;
import com.fusheng.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//配置类==配置文件
@Configuration//告诉spring这是一个配置类
//@ComponentScan(value = "com.fusheng",excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Service.class})
//})//可以指定要排除哪些Bean
@ComponentScan(value = "com.fusheng",includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class),//按照注解
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = BookService.class),//按照类型
        @ComponentScan.Filter(type = FilterType.CUSTOM, value = MyTypeFilter.class)
},useDefaultFilters = false)//可以通过设置Filter规则指定要包含哪些bean
public class MainConfig {
    //给ioc容器注册一个Bean，类型为函数返回值的类型，id默认使用方法名
    @Bean(value = "person")//手动用value指定bean的名称
    public Person person01(){
        return new Person("李四",20);
    }
}
