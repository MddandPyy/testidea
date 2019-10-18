package com.example.springboot.controller.config;

import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.config.AutoTuneConfig;
import io.ebean.config.ServerConfig;
import io.ebean.config.UnderscoreNamingConvention;
import io.ebean.spring.txn.SpringJdbcTransactionManager;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class MyEbeanServerFactory implements FactoryBean<EbeanServer> {

    @Autowired
    CurrentUser currentUser;

//  @Autowired
//  DataSource dataSource;

    @Override
    public EbeanServer getObject() throws Exception {

        ServerConfig config = new ServerConfig();
        config.setName("db");
        config.setCurrentUserProvider(currentUser);

//    // set the spring's datasource and transaction manager.
//    config.setDataSource(dataSource);
 //       config.setExternalTransactionManager(new SpringAwareJdbcTransactionManager());

        config.loadFromProperties();
        config.loadTestProperties();

        return EbeanServerFactory.create(config);
    }

    @Override
    public Class<?> getObjectType() {
        return EbeanServer.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
