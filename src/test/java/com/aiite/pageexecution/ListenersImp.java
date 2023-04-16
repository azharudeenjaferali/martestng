package com.aiite.pageexecution;

import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImp implements ITestListener, IRetryAnalyzer {

	private int retryCount = 0;
	private static final int maxRetryCount = 3;


	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test execution starting..");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("This test is passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("This test is failed");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("This test is skipped");

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish");

	}

	@Override
	public boolean retry(ITestResult result) {
		if (retryCount < maxRetryCount) {
		      retryCount++;
		      return true;
		    }
		return false;
	}

}
