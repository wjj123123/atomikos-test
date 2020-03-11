package com.wjj.atomikostest;


import com.wjj.atomikostest.dao.db1.Test1Mapper;
import com.wjj.atomikostest.dao.db2.Test2Mapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AtomikosTestApplication.class)
public class Test {

    @Autowired
    Test2Mapper test2Mapper;

    @Autowired
    Test1Mapper test1Mapper;

    @org.junit.Test
    public void test() throws Exception {
        test2Mapper.inserttest();
        test1Mapper.inserttest();
    }
}
