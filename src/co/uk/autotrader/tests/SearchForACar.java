package co.uk.autotrader.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import co.uk.autotrader.helper.Helper;
import co.uk.autotrader.pages.AutotraderHomepage;
import co.uk.autotrader.pages.AutotraderSearchResultPage;
import co.uk.autotrader.utilities.ExcelUtils;

public class SearchForACar extends Helper 
{
	
	AutotraderHomepage homepage = new AutotraderHomepage();
	AutotraderSearchResultPage searchResult = new AutotraderSearchResultPage();
	
	private String postCode;
	private String distance;
	private String carMake;
	private String carModel;
	private String minPrice;
	private String maxPrice;
	private String path;
	
	
	
	

	@Before
	public void SetUp() throws Exception 
	{
		postCode = null;
		distance = null;
		carMake = null;
		
		path = "./src/co/uk/autotrader/data/AutotraderData.xlsx";
		launchBrowser("Chrome");
		
		ExcelUtils.SetExcelFilePath(path);
		
	
	}

	@After
	public void Teardown() throws Exception 
	{
		ExcelUtils.closeWorkbook();
		closeBrowser();

	}

	@Test
	public void SearchForACarTest() throws Exception 
	{
		for (int row= 1; row < ExcelUtils.LastRowNum(path);row++ )
		{
		
		postCode = ExcelUtils.GetCellData(row, 0);
		distance = ExcelUtils.GetCellData(row, 1);
		carMake = ExcelUtils.GetCellData(row, 2);
		carModel = ExcelUtils.GetCellData(row, 3);
		minPrice = ExcelUtils.GetCellData(row, 4);
		maxPrice = ExcelUtils.GetCellData(row, 5);
		
		
		//Given I Navigate to Autotrader Homepage
		GivenINavigateAutotraderHomepage();
		//When I enter my postcode
		//homepage.AndITypeIntoPostcodeField();
		homepage.AndITypeIntoPostcodeField(postCode);
		//And I select a distance
		//homepage.AndISelectDistance();
		homepage.AndISelectDistance(distance);
		//And I select a car make
		//homepage.AndISelectTheMakeofTheCar();
		homepage.AndISelectTheMakeofTheCar(carMake);
		//And I select a car model
		//homepage.AndISelectTheModelofTheCar();
		homepage.AndISelectTheModelofTheCar(carModel);
		//And I select  a minimum price
		//homepage.AndISelectMinPrice();
		homepage.AndISelectMinPrice(minPrice);
		//And I select a maximum price
		//homepage.AndISelectMaxPrice();
		homepage.AndISelectMaxPrice(maxPrice);
		// And I click on search car button
		homepage.AndIClickOnSearchCarButton();
		//Then a list of car matching my criteria is displayed
		searchResult.ThenListOfCarDisplayedIsCorrect();
		}
		 
		
		
	}

}
