package com.qa.test;

import org.testng.annotations.Test;

public class HelloWorldTest {
	@Test(priority=1)
	public void display()
	{
		System.out.println("Welcome to maven testing1");
	}
	@Test(priority=2)
	public void display1()
	{
		System.out.println("Welcome to maven testing2");
	}@Test(enabled= false)
	public void display3()
	{
		System.out.println("Welcome to maven testing2");
	}
}
