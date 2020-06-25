package shopp.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	/**
	 * threadPoolSize	调用该方法的线程池容量		该例就是同时起5个线程并行执行该方法
	 * invocationCount	该方法总计需要被执行的次数	该例子中5个线程同时执行，当总计执行次数达到10次时，停止
	 * */ 
	
	@Test(dataProvider = "dp", enabled = true, threadPoolSize = 5, invocationCount = 5)
	public void f(Integer n, String s) {
		System.out.println("@Test(dataProvider = \"dp\") 注解  测试方法,传入参数  " + n + ":" + s);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod 注解  测试方法开始之前运行");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod 注解  测试方法结束之后运行");
	}

	// 导入参数
	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass 注解  测试类开始之前运行");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass 注解   测试类结束之后运行");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest 注解  测试开始之前运行");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest 注解  测试结束之后运行");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite 注解  测试套件开始之前运行");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite 注解  测试套件结束之后运行");
	}

}
