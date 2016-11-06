package co.uk.autotrader.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import co.uk.autotrader.helper.Helper;

public class AutotraderSearchResultPage extends Helper

{
	private List<WebElement> CarList; 
	
	
	
	
	public void ThenListOfCarDisplayedIsCorrect () throws Exception
	{
		CarList = getElementsByClassName("search-result__title");
		
		Assert.assertTrue(CarList.size()> 1);
	}
	
	
}
	
	

