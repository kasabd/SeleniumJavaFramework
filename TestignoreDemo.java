package DemoTestPriority;

import org.junit.Ignore;
import org.testng.annotations.Test;
public class TestignoreDemo {
	
	@org.testng.annotations.Ignore
	public void test1() {
		System.out.println("I am inside test1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside test2");
	}
	public void test3() {
		System.out.println("I am inside test3");
	}
}
	
	