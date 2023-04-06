package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
 * this class contain all the element and respective business libraries of Testing page
 * @author SATURN
 */
public class TestingPage {
	//declaration
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;
	@FindBy(xpath="//img[@id='Selenium Training']")
	private WebElement seleniumTrainingImage;
	@FindBy(id="CartArea")
	private WebElement cartArea;
	@FindBy(xpath="//ul[@class='list-socialicons']"+"/descendant::i[@class='fa fa-facebook']")
	private WebElement facebookIcon;
	
	
	//initialization
	public TestingPage(WebDriver driver) {
         PageFactory.initElements(driver,this);
	}
	//Utilization
	/*
	 * this method return page header text
	 * @return
	 */
	public String getPageHeader() {
		return pageHeader.getText();
		
	}
	/*
	 * this method return selenium training image
	 * @return
	 */
	public WebElement getSeleniumTrainingImage() {
		return seleniumTrainingImage;
		
	}
	/*
	 * this method return cart area web element
	 * @return
	 */
	public WebElement getCartArea() {
		return cartArea;
		
	}
	/*
	 * this method return facebook icon
	 * @return
	 */
	public WebElement getFacebookIcon() {
		return facebookIcon;
		
	}
	/*
	 * this method is used to click facebook icon
	 */
	public void clickFacebookIcon() {
		facebookIcon.click();
	}
}	
