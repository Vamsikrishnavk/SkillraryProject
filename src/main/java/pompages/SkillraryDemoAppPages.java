package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generalLibraries.WebDriverUtility;

/*
 * this class contain all the element and respective bussiness libraries of skillrary demo app page
 * @author SATURN
 */


public class SkillraryDemoAppPages {
	private static final WebElement pageHeader = null;
	//declaration
	@FindBy(xpath="//div[@class='navbar-header']/a")
	private WebElement pageHeaader;
	@FindBy(xpath="//a[text()='Course']")
	private WebElement courseTab;
	@FindBy(xpath="//span/a[text()='Selenium Training']")
	private WebElement seleniumTrainingLink;
	@FindBy(name="addresstype")
	private WebElement categoryDropdown;
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactUsLink;
	
	//initialization
	public SkillraryDemoAppPages(WebDriver driver) {
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
	 * this methods is used to mouse hover to course tab
	 * @param Web
	 */
	public void mouseHoverToCourse(WebDriverUtility Web) {
		Web.mouseHover(courseTab);
	}
	/*
	 * this method is used to click on selenium training link
	 */
	public void clickSeleniumTraining() {
		seleniumTrainingLink.click();
		}
	/*
	 * this method is used to choose category from drop down
	 * @param web
	 * @param index
	 */
	public void selectCategory(WebDriverUtility web,int index) {
		web.dropdown(categoryDropdown,index);
	}
	/*
	 * this method is used to click on contact us link
	 */
	
	public WebElement getContactUsLink()
	{
		return contactUsLink;
	}
	public void clickContactUs()
	{
		contactUsLink.click();
	}
	
	
}
