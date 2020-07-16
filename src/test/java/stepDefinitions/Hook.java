package stepDefinitions;

import base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;


public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void setUp() {
        String chromeDriverLocation = "src/main/resources/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
        base.driver = new ChromeDriver();
        base.driver.manage().window().maximize();

    }

    @After
    public void teardown() throws Exception {
        takeScreenshot();
        base.driver.quit();
    }

    private void takeScreenshot() throws Exception {
        TakesScreenshot scrShot = ((TakesScreenshot) base.driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("target/Screenshot" + System.currentTimeMillis() + ".png"));
    }

}
