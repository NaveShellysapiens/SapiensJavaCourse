//package com.sapiens.Springdemo.di;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class ConstructorBasedDI {
//    @Bean
//    public AccountService accountService(){
//        return new AccountService();
//    }
//
//    @Bean
//    public AccountServiceClient accountServiceClientServiceClient(){
//        return new AccountServiceClient(accountService());
//    }
//
//    public static class AccountServiceClient{
//        private AccountService accountService;
//        //constructor based DI
//        public AccountServiceClient(AccountService accountService) {
//            this.accountService = accountService;
//        }
//
//        public void showAccountDetails(){
//            System.out.println(accountService.getAccountDetails("200"));
//        }
//    }
//
//
//}
