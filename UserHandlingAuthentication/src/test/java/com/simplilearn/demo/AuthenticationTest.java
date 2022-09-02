package com.simplilearn.demo;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AuthenticationTest {
private Authentication auc;
	
	@Before
	public void setup() {
		auc = new Authentication();
		System.out.println("Login Initiated");
	}
	
	@After
	public void tearDown() {
		auc = null;
		System.out.println("Login Closed");
	}
	@Test
	public void aucTest1() {
		assertEquals(true,auc.authentication("rishitha","rishitha@123"));
		
	}
	
	@Test
	public void aucTest2() {
		assertEquals(false,auc.authentication("rishitha","fhvndjncmxkcm"));
	}
	
	@Test
	public void aucTest3() {
		assertEquals(false,auc.authentication("bvfjfncinklao","rishitha@123"));
	}
	
	@Test
	public void aucTest4() {
		assertEquals(false,auc.authentication("jnvyfch","hfvycuh8ceo"));
	}

}
