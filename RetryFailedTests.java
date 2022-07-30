package DemoTestPriority;

import org.junit.Assert;
import org.testng.annotations.Test;

public class RetryFailedTests {
	@Test
	public void test1() {
		System.out.println("I am in test1");
	}
	@Test
	public void test2() {
		System.out.println("I am in test2");
		int i= 1;
	}
	@Test(retryAnalyzer = FailedtestRerun.class)
	public void test3() {
		System.out.println("I am in test3");
		Assert.assertTrue(0>1);
	}
}
