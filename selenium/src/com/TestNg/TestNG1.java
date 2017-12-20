package com.TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 {
	
	/*@AfterMethod
	public void closeBrowser(){
		System.out.println("kill the broswer");
	}*/
	@Test
	public void tc_1()
	{
		System.out.println("this is first test case");
		
	}
	@Test(enabled=true)
	public void tc_2(){
		System.out.println("this is second testcase");
	}
	
	/*@BeforeMethod
	public void setUp(){
		System.out.println("lunch the browser");
	}*/
	@Test
	public void tc_3(){
		System.out.println("this is third tast case" );
	}
	@BeforeClass
	public void start(){
		System.out.println("execution is ready");
	}
}
