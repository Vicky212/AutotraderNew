package co.uk.autotrader.pages;

import org.openqa.selenium.WebElement;
import co.uk.autotrader.helper.Helper;

public class AutotraderHomepage extends Helper

{
	private WebElement Postcode;
	private WebElement Distance;
	private WebElement Make;
	private WebElement Model;
	private WebElement MinPrice;
	private WebElement MaxPrice;
	private WebElement SearchCarButton;
	
	
	public void AndITypeIntoPostcodeField() throws Exception {
		Postcode = getElementById("postcode");
		Postcode.clear();
		Postcode.sendKeys("OL9 8LE");
	}

	
	public void AndITypeIntoPostcodeField(String code) throws Exception {
		Postcode = getElementById("postcode");
		Postcode.clear();
		Postcode.sendKeys(code);
	}
	
	
	public void AndISelectDistance() throws Exception {
		Distance = getElementById("radius");

		selectByText(Distance, "Within 30 miles");
	}

	public void AndISelectDistance(String distanceTo) throws Exception {
		Distance = getElementById("radius");

		selectByText(Distance, distanceTo);
	}
	
	public void AndISelectTheMakeofTheCar() throws Exception {
		Make = getElementById("searchVehiclesMake");

		selectByValue(Make, "KIA");
	}

	public void AndISelectTheMakeofTheCar(String carMake) throws Exception {
		Make = getElementById("searchVehiclesMake");

		selectByValue(Make, carMake);
	}
	
	public void AndISelectTheModelofTheCar() throws Exception 
	{
		Model = getElementById("searchVehiclesModel");
		selectByValue(Model, "OPTIMA");
	}

	public void AndISelectTheModelofTheCar(String carModel) throws Exception 
	{
		Model = getElementById("searchVehiclesModel");
		selectByValue(Model, carModel);
	}
	
	
	public void AndISelectMinPrice() throws Exception 
	{
		MinPrice = getElementById("searchVehiclesPriceFrom");
		selectByValue(MinPrice, "8000");

	}

	public void AndISelectMinPrice(String lowPrice) throws Exception 
	{
		MinPrice = getElementById("searchVehiclesPriceFrom");
		selectByValue(MinPrice, lowPrice);

	}
	
	public void AndISelectMaxPrice() throws Exception 
	{
	MaxPrice = getElementById("searchVehiclesPriceTo");
	selectByValue(MaxPrice, "18000");
	}

	public void AndISelectMaxPrice(String HighestPrice) throws Exception 
	{
	MaxPrice = getElementById("searchVehiclesPriceTo");
	selectByValue(MaxPrice, HighestPrice);
	}
	
	public void AndIClickOnSearchCarButton () throws Exception
	
	{
		SearchCarButton = getElementById("search");
		
		SearchCarButton.click();
	}
}
