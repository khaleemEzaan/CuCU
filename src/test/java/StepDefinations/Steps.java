package StepDefinations;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObj;

public class Steps extends BaseClass {
	
	@Before 
	public void setup() throws IOException 
	{
		configprop=new Properties();
		FileInputStream configPropFile = new FileInputStream("C:\\Users\\lenovo\\Desktop\\CUCU_FUCKUU\\HelpMeCUCUMBER\\config.properties");
		configprop.load(configPropFile);
				
		
		logger=Logger.getLogger("OrangeHrm");  // Added Logger
		PropertyConfigurator.configure("C:\\Users\\lenovo\\Desktop\\CUCU_FUCKUU\\HelpMeCUCUMBER\\log4j.properties");
		
		
		String br= configprop.getProperty("browser");
		 if(br.equals("firefox")) {
				System.setProperty("WebDriver.gecko.driver",configprop.getProperty("firefoxpath"));
			    driver=new ChromeDriver();
			    logger=Logger.getLogger("OrangeHrm"); 
			}
	else if(br.equals("chrome")) {
			System.setProperty("WebDriver.chrome.driver",configprop.getProperty("chromepath"));
		    driver=new ChromeDriver();
		}
		
	}
	
	
	
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		
	  
	    lp=new LoginPageObj(driver);
	    
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		  logger.info("***********BROWSER LAUNCHED***************");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	}

	@When("User enters username as {string} and password as {string} And Click on Login")
	public void user_enters_username_as_and_password_as_and_click_on_login(String username, String password) throws InterruptedException {
		  logger.info("***********APP OPENED***************");
		lp.setUsername(username);
	   Thread.sleep(2000);
	   lp.setpassword(password);
	   lp.clicklogin();
	   logger.info("***********LOGIN SUCCESSFULL***************");
	  
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
		
			System.out.println(driver.getTitle());
		
	    
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		
		lp.clicklogout();
		  logger.info("***********LOGOUT DONE***************");
		
	    
	}
}
