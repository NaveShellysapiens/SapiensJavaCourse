package com.sapiens.Springdemo.di;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetterBasedDI {
    @Bean
    public AccountService accountService(){
        return new AccountService();
    }

    @Bean
    public AccountServiceClient accountServiceClientServiceClient(){
        return new AccountServiceClient();
    }

    public static class AccountServiceClient{
        private AccountService accountService;

        @Autowired
        public void setAccountService(AccountService accountService) {
            this.accountService = accountService;
        }

        public void ShowAccountDetails(){
            System.out.println(accountService.getAccountDetails("12345"));
        }
    }
}
