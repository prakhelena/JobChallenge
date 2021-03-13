package MyJob.JobChallenge;

import org.testng.annotations.Test;
import pages.Elements;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;



public class InvalidInput extends TestBase{

    @Test
    public void inputLetters()
    {
    	
    String uniqueBarNumber ="";	
    	Elements el = new Elements();
    	el.leftBowlButton.sendKeys("h");
    	el.rightBowlButton.sendKeys("k");
    	el.weighButton.click();
    	
   	String result = el.invalidInput.getText();
   	String expectedResult = "[] = []";
   	
   	assertEquals(result, expectedResult);

    }
    
    @Test
    public void inputNegative()
    {
    	
    String uniqueBarNumber ="";	
    	Elements el = new Elements();
    	el.leftBowlButton.sendKeys("-1");
    	el.rightBowlButton.sendKeys("-4");
    	el.weighButton.click();
    	
    	String result = el.invalidInput.getText();
       	String expectedResult = "[] = []";
       	
       	assertEquals(result, expectedResult);

        }
    
}

