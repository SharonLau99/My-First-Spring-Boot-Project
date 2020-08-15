package org.sharon.springboot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.sharon.springboot.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootDay01HelloworldQuickApplicationTests {
    @Autowired
    private Person person;

    @Autowired
    ApplicationContext ioc;

    @Autowired
    DataSource dataSource;

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {
        System.out.println(person);
        logger.trace("这是trace");
        logger.debug("这是debug");
        logger.info("这是info");
        logger.warn("这是warn");
        logger.error("这是error");
    }

    @Test
    void jdbcTest() throws SQLException {
        System.out.println(dataSource.getClass());

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }


    @Test
    void teset01() {
        System.out.println(ioc.containsBean("helloService"));
    }
}
