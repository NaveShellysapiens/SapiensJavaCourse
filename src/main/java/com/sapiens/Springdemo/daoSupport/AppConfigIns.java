package com.sapiens.Springdemo.daoSupport;

import com.sapiens.Springdemo.daoSupport.Insurance.InsuranceClientBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan
public class AppConfigIns {
    @Bean
    public LocalEntityManagerFactoryBean entityManagerFactoryBean() {
        LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
        factoryBean.setPersistenceUnitName("example-unit");
        return factoryBean;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfigPerson.class);
        context1.getBean(InsuranceClientBean.class).run();
        context1.getBean(LocalEntityManagerFactoryBean.class).destroy();
    }
}