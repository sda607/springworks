package com.spring.presistence;


import lombok.extern.log4j.Log4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")

@Log4j
public class DataSourceTests {

    @Autowired
    private DataSource ds;

    @Autowired
    private SqlSessionFactory sessionFactory;

    @Test
    public void testConnection() {
        try (Connection con = ds.getConnection()) {
            log.info(con);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
        }
    }

    @Test
    public void testConnection2() throws SQLException {

        try (SqlSession session = sessionFactory.openSession();
             Connection con = session.getConnection()) {
            log.info(session);
            log.info(con);
        }
    }


}