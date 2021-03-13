package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class Elements {
		
		public Elements() {
			PageFactory.initElements(Driver.getDriver(), this);
		}
		
		@FindBy (id = "weigh")
		public WebElement weighButton;
		
		@FindBy (id = "reset")
		public WebElement resetButton;
		
		@FindBy (xpath = "//input[@id=\"left_0\"]")
		public WebElement leftBowlButton;
		
		@FindBy (xpath = "//input[@id=\"left_1\"]")
		public WebElement leftBowlButton1;
		
		@FindBy (xpath = "//input[@id=\"left_2\"]")
		public WebElement leftBowlButton2;
		
		@FindBy (xpath = "//input[@id=\"left_3\"]")
		public WebElement leftBowlButton3;
		
		@FindBy (xpath = "//input[@id=\"left_4\"]")
		public WebElement leftBowlButton4;
		
		
		@FindBy (xpath = "//input[@id=\"right_0\"]")
		public WebElement rightBowlButton;
		
		@FindBy (xpath = "//input[@id=\"right_1\"]")
		public WebElement rightBowlButton1;
		
		@FindBy (xpath = "//input[@id=\"right_2\"]")
		public WebElement rightBowlButton2;
		
		@FindBy (xpath = "//input[@id=\"right_3\"]")
		public WebElement rightBowlButton3;
		
		@FindBy (xpath = "//input[@id=\"right_4\"]")
		public WebElement rightBowlButton4;
		
		@FindBy (xpath = "(//*[@class=\"button\"])[1]")
		public WebElement resultButton;
		
		@FindBy (id = "coin_0")
		public WebElement findBarButton;
		
		@FindBy (id = "coin_1")
		public WebElement findBarButton1;
		
		@FindBy (id = "coin_2")
		public WebElement findBarButton2;
		
		@FindBy (id = "coin_3")
		public WebElement findBarButton3;
		
		@FindBy (id = "coin_4")
		public WebElement findBarButton4;
		
		@FindBy (id = "coin_5")
		public WebElement findBarButton5;
		
		@FindBy (id = "coin_6")
		public WebElement findBarButton6;
		
		@FindBy (id = "coin_7")
		public WebElement findBarButton7;
		
		@FindBy (id = "coin_8")
		public WebElement findBarButton8;
}