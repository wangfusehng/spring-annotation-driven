package com.fusheng.configs;

import com.fusheng.models.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//配置类==配置文件
@Configuration//告诉spring这是一个配置类
public class MainConfig {
    //给ioc容器注册一个Bean，类型为函数返回值的类型，id默认使用方法名
    @Bean(value = "person")//手动用value指定bean的名称
    public Person person01(){
        return new Person("李四",20);
    }
}
