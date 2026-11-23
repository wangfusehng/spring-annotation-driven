package com.fusheng;

import com.fusheng.configs.MainConfig;
import com.fusheng.models.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppliaction {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Object person = applicationContext.getBean("person");
//        System.out.println(person);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person p1 = applicationContext.getBean(Person.class);
//        System.out.println(p1);
        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }
}
