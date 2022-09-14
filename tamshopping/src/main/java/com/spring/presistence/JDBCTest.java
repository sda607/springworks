package com.spring.presistence;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

@Log4j
public class JDBCTest {

	@Test
	public void testConntection() throws Exception{
		Class clz = Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", 
									"c##tomandmayproject", "12345");


		
		con.close();
	}

}
