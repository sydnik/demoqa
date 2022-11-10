package framework;

import org.testng.annotations.*;
import framework.utils.ConfigUtil;
import framework.utils.DriverUtil;
import framework.utils.LoggerUtil;

public abstract class BaseTest {
    private long time;

    @BeforeTest
    public void startTest(){

    }

    @AfterTest
    public void finishTest(){

    }

    @BeforeMethod
    @Parameters("browser")
    public void startMethod(String browser) {
        time=System.currentTimeMillis();
        ConfigUtil.getInstance();
        DriverUtil.getInstance(browser);

    }

    @AfterMethod
    public void endMethod(){
        if (DriverUtil.getWebDriver()!=null) {
            DriverUtil.close();
        }
        LoggerUtil.info(this.getClass(),"Tests completed:" + (System.currentTimeMillis()-time) + " ms");
    }
}
