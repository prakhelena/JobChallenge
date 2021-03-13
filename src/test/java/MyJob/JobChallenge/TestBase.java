package MyJob.JobChallenge;


import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import utilities.ConfigReader;
import utilities.Driver;


public abstract class TestBase {


    protected WebDriver driver;
   
    
    @BeforeMethod (alwaysRun = true)
    public void setupMethod() {
        
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));}
    
	

        
        

    @AfterMethod (alwaysRun = true)
    public void teardownMethod(){
        Driver.quit();
    
    }
    

}
