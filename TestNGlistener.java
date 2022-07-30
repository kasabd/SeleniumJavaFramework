package TestNGListeners;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;


public class TestNGlistener implements ITestListener{

	public void onTestStart(ITestResult result){
		System.out.println("****Test started " + result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("****Test is succesful " + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("****Test failed " + result.getName());
	}
	public void 	onTestSkipped(ITestResult result) {
		System.out.println("****Test has been skipped " + result.getName());

	}
	public void onFinish(ITestContext context) {
		System.out.println("****Test has been completed " + context.getName());
	
}
}
