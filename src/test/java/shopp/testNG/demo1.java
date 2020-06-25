package shopp.testNG;

import org.testng.ITestNGListener;
import org.testng.TestNG;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

class demo1 {
	// https://javadoc.jitpack.io/com/github/cbeust/testng/master/javadoc/
	public static void main(String[] args) {
		TestNG testng = new TestNG();
		
		testng.setDefaultSuiteName("tsetNG-demo1");
		
		// 设置报表输出路径
		testng.setOutputDirectory("C:\\Users\\LiuJiawei\\Desktop\\testNG");
		
		
		// 将测试类设置为由此 TestNG 对象运行
		testng.setTestClasses(new Class[] { demo1.class });
		// 启动
		testng.run();
	}
	
	 @BeforeClass
	 public void setUp() {
	   System.out.println("@BeforeClass 注解 将在生成测试类后以及运行任何测试方法之前调用");
	 }

	
	 @Test(groups = { "fast" })
	 public void aFastTest() {
	   System.out.println("Fast test");
	 }
	 
	 @Test(groups = { "slow" })
	 public void aSlowTest() {
	    System.out.println("Slow test");
	 }
	 

}
