package com.wjj.atomikostest.configure;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages="com.wjj.atomikostest.dao.db2",sqlSessionFactoryRef = "db2SqlSessionFactory")
public class Tidb2DataSourceConfigure extends DateSourceAutoConfigure{

    @Bean
    public SqlSessionFactory db2SqlSessionFactory() throws Exception {
        return sqlSessionFactory(dataSourceProperties.getDb2(),"db2DataSource");
    }

    @Bean
    public SqlSessionTemplate db2SqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(db2SqlSessionFactory());
    }
}
