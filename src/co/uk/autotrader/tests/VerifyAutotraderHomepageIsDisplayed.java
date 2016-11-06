package co.uk.autotrader.tests;

import org.junit.After;
import org.junit.Before;
// to import @Before, type @Before,Press Ctrl and space, select the first one to import it, same for After and Test
import org.junit.Test;

import co.uk.autotrader.helper.AutotraderHelper;

// to import the autotrader helper class,  write extends autotraderH, press Ctrl and Space to import the helper class
// We use extends to inherit the methods that are public in another class
public class VerifyAutotraderHomepageIsDisplayed extends AutotraderHelper
{
	@Before
	public void SetUp()
	{
		LaunchBrowser();
	}

	@After
	public void TearDown()
	{
		CloseBrowser();
	}
	
	@Test
	public void VerifyAutotraderHomepageIsDisplayedTest()
	{
		GivenINavigateToHomepage();
	}
}
