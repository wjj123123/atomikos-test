package com.wjj.atomikostest.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "spring.datasource.databases")
public class DataSourceProperties {

    private DBConfigProperties db1;

    private DBConfigProperties db2;

    public DBConfigProperties getDb1() {
        return db1;
    }

    public void setDb1(DBConfigProperties db1) {
        this.db1 = db1;
    }

    public DBConfigProperties getDb2() {
        return db2;
    }

    public void setDb2(DBConfigProperties db2) {
        this.db2 = db2;
    }
}
