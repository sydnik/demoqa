package tests;

import framework.BaseTest;
import framework.utils.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ResizablePage;

public class MyTest {
    @Test
    public void test(String name){
        DriverUtil.openURL("https://demoqa.com/resizable");
        ResizablePage resizablePage = new ResizablePage();
        WebDriverWait webDriverWait = new WebDriverWait(DriverUtil.getWebDriver(), 100);
//        webDriverWait.until(ExpectedConditions.numberOfElementsToBe())
        System.out.println(DriverUtil.getWebDriver().findElement(By.xpath("//html")).getText());
        System.out.println();
//        new SoftAssert().
    }
}
