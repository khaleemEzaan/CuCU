package StepDefinations;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.LoginPageObj;

public class BaseClass {
	public WebDriver driver;
	public LoginPageObj lp;
	public static Logger logger;
	public static Properties configprop ;

}
