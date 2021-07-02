package com.kuang.springboot04jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class Springboot04JdbcApplicationTests {
    @Autowired
    DataSource dateSource;


    @Test
    void contextLoads() throws SQLException {
//        System.out.println(dateSource.getClass());
//        Connection connection = dateSource.getConnection();
//        System.out.println(connection);
//        connection.close();
        System.out.println(dateSource.getClass());
        //获得连接
        Connection connection = dateSource.getConnection();
        System.out.println(connection);

        DruidDataSource druidDataSource = (DruidDataSource) dateSource;
        System.out.println("druidDataSource 数据源最大连接数：" + druidDataSource.getMaxActive());
        System.out.println("druidDataSource 数据源初始化连接数：" + druidDataSource.getInitialSize());
        //关闭连接
        connection.close();
    }

}
