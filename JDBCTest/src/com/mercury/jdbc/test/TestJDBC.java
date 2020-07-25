package com.mercury.jdbc.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.mercury.jdbc.JDBCTest;

public class TestJDBC {
	JDBCTest jt;
	@Before
	public void setUp() throws Exception {
		jt = new JDBCTest();
	}

	@Test
	public void testParse() {
		jt.parse();
		
	}

}
