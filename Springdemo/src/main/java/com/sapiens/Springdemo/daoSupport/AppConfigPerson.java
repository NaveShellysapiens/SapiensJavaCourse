package com.sapiens.Springdemo.daoSupport;

import com.sapiens.Springdemo.daoSupport.Employee.EmployeeClientBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan
public class AppConfigPerson {
    @Bean
    public LocalEntityManagerFactoryBean entityManagerFactoryBean() {
        LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
        factoryBean.setPersistenceUnitName("example-unit");
        return factoryBean;
    }

    public static void main(String[] args) {
//       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        context.getBean(PersonClientBean.class).run();
//        context.getBean(LocalEntityManagerFactoryBean.class).destroy();
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfigPerson.class);
        context1.getBean(EmployeeClientBean.class).run();
        context1.getBean(LocalEntityManagerFactoryBean.class).destroy();
    }
}