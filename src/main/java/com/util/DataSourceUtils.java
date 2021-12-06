package com.util;

import javax.annotation.Resource;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@WebListener
public class DataSourceUtils implements ServletContextListener {
    @Resource(name = "jdbc/MySQL")
    private static DataSource dSource;
    public static Connection getConnection() throws SQLException {
        return dSource.getConnection();
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
