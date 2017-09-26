package com.igogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

/**
 * Created by Lee on 2017/7/31.
 */
@SpringBootApplication
@ComponentScan("com.igogo.bo")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
