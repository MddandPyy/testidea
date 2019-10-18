package com.example.springboot.controller.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author sora
 * @date 19-2-25
 */
@Configuration
public class DruidConfiguration {
    private final static Logger logger = LoggerFactory.getLogger(DruidConfiguration.class);
//    @Value("${datasource.default.url}")
//    private String dbUrl;
//    @Value("${datasource.default.username}")
//    private String username;
//    @Value("${datasource.default.password}")
//    private String password;
//    @Value("${datasource.default.driver}")
//    private String driverClassName;


//    /**
//     * Method description
//     *
//     *
//     * @return
//     */
//    @Bean(destroyMethod = "close", initMethod = "init", name = "defaultDs")
//    @Primary
//    public DataSource druidDataSource() {
//        DataSource datasource = new DataSource();
//
//        datasource.setUrl(dbUrl);
//        datasource.setUsername(username);
//        datasource.setPassword(password);
//        datasource.setd
//
//        try {
//            datasource.setFilters(filters);
//        } catch (SQLException e) {
//            logger.error(e.getMessage());
//        }
//
//        logger.info("==============Database:" + dbUrl + "===============");
//
//        return datasource;
//    }


}
