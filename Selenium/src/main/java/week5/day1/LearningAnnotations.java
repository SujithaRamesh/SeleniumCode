package week5.day1;

import org.testng.annotations.*;

public class LearningAnnotations {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}
	@BeforeClass
	public void beforeClass1()
	{
		System.out.println("beforeClass1");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	@Test
	public void test()
	{
		System.out.println("test");
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}
	@AfterClass
	public void afterClass1()
	{
		System.out.println("afterClass1");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("afterTest");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite");
	}
}
