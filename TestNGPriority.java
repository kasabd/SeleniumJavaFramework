package DemoTestPriority;

import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class TestNGPriority {
	
	@Test(priority =1 )
	public void test1() {
		System.out.println("I am inside Test1");
	}
	@Test(priority=-1)
	public void test2() {
		System.out.println("I am inside Test2");
	}
	@Test(priority=0)
	public void test3() {
		System.out.println("I am inside Test3");
	}



}
