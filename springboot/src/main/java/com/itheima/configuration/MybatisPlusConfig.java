//package com.itheima.configuration;
//
//import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
//import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
//import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//
///**
// * Created by lemon on 2018/8/28.
// *
// * @author: lemon
// * @Description:
// * @Modified By:
// */
//@Configuration
//public class MybatisPlusConfig {
//
//    /***
//     * plus 的性能优化
//     * @return
//     */
//    @Bean
//    public PerformanceInterceptor performanceInterceptor() {
//        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
//        /*<!-- SQL 执行性能分析，开发环境使用，线上不推荐。 maxTime 指的是 sql 最大执行时长 -->*/
//        performanceInterceptor.setMaxTime(1000);
//        /*<!--SQL是否格式化 默认false-->*/
//        performanceInterceptor.setFormat(true);
//        return performanceInterceptor;
//    }
//
//    /**
//     * @Description : mybatis-plus分页插件
//     */
//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        return new PaginationInterceptor();
//    }
//
//    /**
//     * @Description : druid注入
//     * @Date : Create in 2018/1/3 17:38
//     */
//    @Bean
//    @ConfigurationProperties("spring.datasource.druid")
//    public DataSource dataSource() {
//        return DruidDataSourceBuilder
//                .create()
//                .build();
//    }
//
//
//}