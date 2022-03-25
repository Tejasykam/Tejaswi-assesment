package com.sapient.aem.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
	private User user=null;
	
	@BeforeEach
	void setUp() throws Exception {
		user= new User(1,"Ranjan","ran@34",Role.ADMIN);
	}

	@AfterEach
	void tearDown() throws Exception {
		user=null;
	}

	@Test
	void testGetUserId() {
		assertEquals(1,user.getUserId(),"testing userid");
	}
	
	@Test
	void testInvalidGetUserId() {
		assertNotEquals(11,user.getUserId(),"testing userid");
	}

	@Test
	void testGetUserName() {
		assertEquals("Ranjan",user.getUserName(),()->"testing username");
	}
	
	@Test
	void testInvalidGetUserName() {
		assertNotEquals("Ranjanss",user.getUserName(),()->"testing username");
	}

	@Test
	void testGetPassword() {
		assertEquals("ran@34",user.getPassword());
	}

	@Test
	void testInvalidGetPassword() {
		assertNotEquals("sumith123",user.getPassword());
	}
	
	
	@Test
	void testGetRole() {
		assertEquals("ADMIN",user.getRole().toString());
	}
	
	@Test
	void testInvalidGetRole() {
		assertNotEquals("EMPLOYEE",user.getRole().toString());
	}

	@Test
	void testSetUserId() {
		user.setUserId(2);
		assertEquals(2,user.getUserId());
	}
	
	@Test
	void testInvalidSetUserId() {
		user.setUserId(102);
		assertNotEquals(101,user.getUserId());
	}

	@Test
	void testSetUserName() {
		user.setUserName("John");
		assertEquals("John",user.getUserName());
	}
	
	@Test
	void testInvalidSetUserName() {
		user.setUserName("John");
		assertNotEquals("smihth",user.getUserName());
	}
	

	@Test
	void testSetPassword() {
		user.setPassword("john@123");
		assertEquals("john@123",user.getPassword());
	}
	
	@Test
	void testInvalidSetPassword() {
		user.setPassword("john@123");
		assertNotEquals("smith@123",user.getPassword());
	}
	

	@Test
	void testSetRole() {
		user.setRole(Role.EMPLOYEE);
		assertEquals(Role.EMPLOYEE,user.getRole());
	}
	
	
	@Test
	void testInvalidSetRole() {
		user.setRole(Role.EMPLOYEE);
		assertNotEquals(Role.ADMIN,user.getRole());
	}

}
