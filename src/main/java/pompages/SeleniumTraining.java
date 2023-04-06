package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generalLibraries.WebDriverUtility;

/*
 * this class contain all the element and respective bussiness libraries of Selenium Training page
 * @author SATURN
 */
public class SeleniumTraining {
   //declaration
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;
	@FindBy(xpath="//button[@id='add']")
	private WebElement plusButton;
	@FindBy(xpath="//button[.='Add to Cart']")
	private WebElement addToCartButton;
	@FindBy(xpath="//div[@id='calloout']/span")
	private WebElement itemAddedMessage;
	//initialization
	public SeleniumTraining(WebDriver driver) {
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
	 * this method is used to double click on plus button
	 * @param Web
	 */
	public void doubleClickAdd(WebDriverUtility web) {
		web.doubleClickOnElement(plusButton);
	}
	/*
	 * this method is used to click add to cart button
	 */
	public void clickAddToCart() {
		addToCartButton.click();
	}
	/*
	 * this method return items added message
	 * @return
	 */
	public String getItemAddedMessage() {
		return itemAddedMessage.getText();
		
	}
		
	}
