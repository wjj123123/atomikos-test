package com.wjj.atomikostest;

import com.wjj.atomikostest.dao.db1.Test1Mapper;
import com.wjj.atomikostest.dao.db2.Test2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
public class AtomikosTestApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AtomikosTestApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AtomikosTestApplication.class);
    }

    @GetMapping("aa")
    @Transactional()
    public void aaa(int v){
        test2Mapper.inserttest();
        int i = 9/v;
        test1Mapper.inserttest();
    }

    @Autowired
    Test2Mapper test2Mapper;

    @Autowired
    Test1Mapper test1Mapper;

}
