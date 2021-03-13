package MyJob.JobChallenge;

import org.testng.annotations.Test;
import pages.Elements;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Driver;



public class AppTest extends TestBase{

    @Test
    public void findUniqueBar()
    {
    	
    String uniqueBarNumber ="";	
    	Elements el = new Elements();
    	el.leftBowlButton.sendKeys("0");
    	el.rightBowlButton.sendKeys("1");
    	el.weighButton.click();
    	
    	String result = el.resultButton.getText();

    	
    	if (result.equals("<")) {
    		uniqueBarNumber = el.findBarButton.getText();
    		el.findBarButton.click();
    	}else if(result.equals(">")) {
    		uniqueBarNumber = el.findBarButton1.getText();
    		el.findBarButton1.click();
    	}else {
    		el.resetButton.click();
    		el.leftBowlButton1.sendKeys("2");
    		el.rightBowlButton1.sendKeys("3");
    		el.weighButton.click();
    		result = el.resultButton.getText();
        	
        	
        	if (result.equals("<")) {
        		uniqueBarNumber = el.findBarButton2.getText();
        		el.findBarButton2.click();
        	}else if(result.equals(">")) {
        		
        		uniqueBarNumber = el.findBarButton3.getText();
        		el.findBarButton3.click();
        	}else {
        		el.resetButton.click();
        		el.leftBowlButton2.sendKeys("4");
        		el.rightBowlButton2.sendKeys("5");
        		el.weighButton.click();
        		result = el.resultButton.getText();

        	
            	if (result.equals("<")) {
            		uniqueBarNumber = el.findBarButton4.getText();
            		el.findBarButton4.click();
            	}else if(result.equals(">")) {
            		uniqueBarNumber = el.findBarButton5.getText();
            		el.findBarButton5.click();
            	}else {
            		el.resetButton.click();
            		el.leftBowlButton3.sendKeys("6");
            		el.rightBowlButton3.sendKeys("7");
            		el.weighButton.click();
            		result = el.resultButton.getText();

                	
                	
                	if (result.equals("<")) {
                		uniqueBarNumber = el.findBarButton6.getText();
                		el.findBarButton6.click();
                	}else if(result.equals(">")) {
                		uniqueBarNumber = el.findBarButton7.getText();
                		el.findBarButton7.click();
                	}else {
                		uniqueBarNumber = el.findBarButton8.getText();
                		el.findBarButton8.click();
                	
                	}
            	}
            	
        	}
    	}
    	int uniqueBarNumberINT = Integer.parseInt(uniqueBarNumber) + 1;
    	String alertMessage = driver.switchTo().alert().getText();

    	
    
System.out.println(alertMessage + " It is a bar with number: " + uniqueBarNumberINT);

    

    }
    
  
}

