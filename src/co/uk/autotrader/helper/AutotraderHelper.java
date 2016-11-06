package co.uk.autotrader.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import co.uk.autotrader.pages.AutotraderHomepage;

public class AutotraderHelper 
{
	// I making this section private so it stays only in helper class
	// to import selenium webdriver  press Ctrl key and space bar, once imported, import bit will appear on top
	
	private static WebDriver driver;
	// to tell it the driver is empty, method helps us to perform actions
	static
	{
		driver = null;
		
	}
	
	/* to specify where the browser lives or the location of the browser,select System.setProperty
	 a method will either contain public, static and it must have parenthesis ()
	method is used to perform an action
	if I want to inherit methods or stuff, it must include static
	if we are going to use Firefox, key will be webdriver.firefox.driver, value 
	System.set words written has to be in small letters, value means location
	to find chromedriver, right click on chromedriver, select properties, select everything on the path
	paste in the value box," /AutotraderNew/lib/chromedriver.exe", then delete till it looks like this
	 ./lib/chromedriver.exe, then put semi-colon to say you have finished it.
	 Doing it this way means lib can be easily found even if it is linked to another project or stored elsewhere
	 
	*/
	
	public static WebDriver ChromeBrowserLocation()
	{
		System.setProperty("webdriver.chrome.driver", 
				"./lib/chromedriver.exe");
		
		// we also need to import chromedriver, so press Ctrl and space, select the first one
		// then put semicolon to end the statement.
		// Ctrl and space bar is used to import
		
		return new ChromeDriver();
	}
	
	// Write a new method without expecting anything to come back, replace Webdriver with void,method has to include (), then put the {}
	
	public static void LaunchBrowser()
	{
		driver = ChromeBrowserLocation();
	}
	
	// Write a close browser method
	// To stop the application from running in the background after closing it, it is  driver.quit
	public static void CloseBrowser()
	{
		driver.close();
		driver.quit();
	}
	
	// Write LaunchUrl method and make it flexible to use and  allow easy access to change
	// Add string to help enter data easily, you have define the url, 
	// our Url can be the uat environment, test environment or production environment, or different website
	// so we can easily modify, put url so driver.navigate().to.(url);
	// when writing text, you have to include the quotation marks by pressing shift key and 2 key
	// to maximize it, driver.manage().window().maximize();
	public static void LaunchUrl(String url)
	{
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	// The Autotrader here can be changed to relate it to the said company you are working for
	// go the website, copy the url from the website and paste it here
	//when there is no void, then we expect the method to return something
	
	public AutotraderHomepage GivenINavigateToHomepage()
	{
		LaunchUrl("http://www2.autotrader.co.uk/");
		
		return new AutotraderHomepage();
	}

	
}
