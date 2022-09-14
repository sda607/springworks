package com.spring.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;


import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTest {

	@Test
	public void testConntection() throws Exception{
		Class clz = Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", 
									"c##tomandmayproject", "12345");
		
		log.info(con);
		
		con.close();
	}

}
