package com.igogo.bo.conf;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by Lee on 2017/7/31.
 */
@Configuration
@MapperScan(basePackages = "com.igogo.bo.mapper")
public class DruidSourceConfig {


    @Value("${druid.type}")
    private Class<? extends DataSource> dataSource;

    @Value("${mybatis.typeAliasesPackage}")
    private String typeAliasesPackage;
    @Value("${mybatis.mapperLocations}")
    private String mapperLocations;


    @Bean(name="masterDataSource",destroyMethod = "close",initMethod = "init")
    @Primary
    @ConfigurationProperties(prefix = "druid.master")
    public DataSource masterDataSource(){
        DataSource build = DataSourceBuilder.create().type(dataSource).build();
        return build;
    }

//    @Bean(name="slaverDataSource",destroyMethod = "close",initMethod = "init")
//    @ConfigurationProperties(prefix = "druid.slaver")
//    public DataSource slaverDataSource(){
//        DataSource build = DataSourceBuilder.create().type(dataSource).build();
//        return build;
//    }


//    @Bean(name = "dataSources")
//    public List<DataSource> dataSourceList(){
//
//        List<DataSource> dataSources = new ArrayList<>();
//        dataSources.add(masterDataSource());
//        dataSources.add(slaverDataSource());
//        return dataSources;
//    }


//    @Bean(name = "readDataSources")
//    public List<DataSource> readDataSources(){
//        List<DataSource> dataSources=new ArrayList<>();
//        dataSources.add(masterDataSource());
//        dataSources.add(slaverDataSource());
//        return dataSources;
//    }


    @Bean
    public SqlSessionFactory sqlSessionFactory(@Qualifier("masterDataSource")DataSource ds) throws Exception {
        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
        fb.setDataSource(ds);//指定数据源(这个必须有，否则报错)
        //下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
        fb.setTypeAliasesPackage(typeAliasesPackage);//指定基包
        fb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapperLocations));//指定xml文件位置

        return fb.getObject();
    }

}
