package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPageObj {
	
	public WebDriver ldriver ;
	public WebDriverWait wait;

	
	public LoginPageObj(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
			By txtusername=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
			By txtpassword=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]");
			By loginbutton=By.xpath("//button[normalize-space()='Login']");
			By profileButton=By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
			By logoutbutton=By.linkText("Logout");
			public void setUsername(String username) {
				ldriver.findElement(txtusername).sendKeys(username);
				}
			public void setpassword(String password) {
				ldriver.findElement(txtpassword).sendKeys(password);
			}
			public void clicklogin() {
				ldriver.findElement(loginbutton).click();
			}
			public void clicklogout() throws InterruptedException {
				ldriver.findElement(profileButton).click();
				Thread.sleep(3000);
				ldriver.findElement(logoutbutton).click();
				Thread.sleep(3000);
				
			}
}
