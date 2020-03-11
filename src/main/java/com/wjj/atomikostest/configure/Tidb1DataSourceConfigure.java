package com.wjj.atomikostest.configure;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages="com.wjj.atomikostest.dao.db1",sqlSessionFactoryRef = "db1SqlSessionFactory")
public class Tidb1DataSourceConfigure extends DateSourceAutoConfigure{

    @Bean
    public SqlSessionFactory db1SqlSessionFactory() throws Exception {
        return sqlSessionFactory(dataSourceProperties.getDb1(),"db1DataSource");
    }

    @Bean
    public SqlSessionTemplate db1SqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(db1SqlSessionFactory());
    }
}
