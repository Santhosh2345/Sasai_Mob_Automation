package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import utilities.UtilityCustomFunctions;

public class MenuListPage extends BasePage{

	public MenuListPage(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id='vertical_header_name']/i")
	WebElement lstAllItems;
	
	@FindBy(xpath="//div[contains(text(),'CRMEditFieldModule')]")
	WebElement mnuEditFieldModule;
	
	@FindBy(xpath="//div[contains(text(),'CRMEditFieldModule')]")
	WebElement mnu;
	
	
	
	
	//div[contains(text(),'CRMEditFieldModule')]
	
	//Click Methods
	public void clickMnuAllItemsList() throws Exception {
		UtilityCustomFunctions.doClick(Adriver, lstAllItems);
	}
	
}
