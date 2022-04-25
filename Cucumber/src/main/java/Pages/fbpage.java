package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbpage {
public static WebDriver driver;
	
	@FindBy(id="email") WebElement email;
	@FindBy(id="pass") WebElement pass;
	@FindBy(xpath="//*[@class = '_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']") WebElement login;
	
	public fbpage(WebDriver driver) {
		fbpage.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	public void emailid(String emailtext) {
		email.sendKeys(emailtext);
	}
	
	public void password(String passtext) {
		pass.sendKeys(passtext);
	}
	
	public void loginclick() {
		login.click();
	}
	
	

}
