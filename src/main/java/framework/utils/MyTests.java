package framework.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.*;


public class MyTests implements ITestListener {
    @BeforeTest()
    public void beforeSuite(){
        System.out.println("Run beforeSuite");
    }
    @BeforeClass()
    public void beforeClass(){
        System.out.println("Run beforeCLass");
    }
    @BeforeGroups()
    public void beforeGroups(){
        System.out.println("Run beforeGroups");
    }
    @BeforeTest()
    public void beforeTest(){
        System.out.println("Run beforeTest");
    }
    @BeforeMethod()
    public void beforeMethod(){
        System.out.println("Run beforeMethod");
    }
    @AfterSuite()
    public void afterSuite(){
        System.out.println("Run afterSuite");
    }
    @AfterClass()
    public void afterClass(){
        System.out.println("Run afterCLass");
    }
    @AfterGroups()
    public void afterGroups(){
        System.out.println("Run afterGroups");
    }
    @AfterTest()
    public void afterTest(){
        System.out.println("Run afterTest");
    }
    @AfterMethod()
    public void afterMethod(){
        System.out.println("Run afterMethod");
    }



    @Test(groups = "qwe")
    public void test() throws InterruptedException {
        System.out.println("test qwe");
    }

    @Test(groups = "ewq")
    public void test1() throws InterruptedException, NoSuchFieldException, IllegalAccessException {
        System.out.println("i here");

    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("i here");
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("first test completed");
        ITestListener.super.onTestSuccess(result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("i here");
        ITestListener.super.onTestFailure(result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("i here");
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("i here");
        ITestListener.super.onFinish(context);
    }
}
