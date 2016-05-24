package by.bsu.cp.controller;


import by.bsu.cp.dao.connection.TestJdbcConnector;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by Pavel Hrynchanka on 5/24/2016.
 */
@WebListener
public class PoolListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        TestJdbcConnector connector = TestJdbcConnector.getInstance();
        connector.init();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
