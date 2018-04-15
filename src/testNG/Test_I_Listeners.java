
package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Test_I_Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {//ItestResults stores results 
													// in object called result
		System.out.println("The testcase started " +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		System.out.println("Testcase passed and details are "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test failed and details are "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("testcase skipped and results are "+result.getName());		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

}
