package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///

public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01()throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        

        // Launch Chrome :
        // Load URL :https://www.globalsqa.com/demo-site/select-dropdown-menu/
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        Thread.sleep(3000);
        // Create object os select class :
        // Click on dropdown  Using Locator "Tag Name":"select" 
        Select se = new Select(driver.findElementByTagName("select"));
        // Select india by Object.method :selectByVisibleText("India");
        se.selectByVisibleText("India");
        Thread.sleep(2000);

        //Create a WebElement to Locate the first selected option by object.method :getFirstSelectedOption();
        WebElement firstSelectedOption = se.getFirstSelectedOption();
        //store it in the String and call method :getText();
        String selectedOption = firstSelectedOption.getText();
        //Print the selected option
        System.out.println("Selected element: " + selectedOption);
    }


}
