package generalLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import generalLibraries.ExecelUtility;
import generalLibraries.IConstantPath;
import generalLibraries.JavaUtility;
import generalLibraries.PropertiesFileUtility;
import generalLibraries.WebDriverUtility;
import pompages.ContactUsPage;
import pompages.HomePage;
import pompages.SeleniumTraining;
import pompages.SkillraryDemoAppPages;
import pompages.TestingPage;

public class BaseClass {
	protected WebDriverUtility web;
	protected PropertiesFileUtility property;
	protected ExecelUtility excel;
	protected JavaUtility jUtil;
	protected HomePage home;
	protected WebDriver driver;
	protected SkillraryDemoAppPages demoApp;
	protected SeleniumTraining selenium;
	protected TestingPage testing;
	protected ContactUsPage concat;
	protected ContactUsPage contact;
	//@BeforeSuite
	//@BeforeTest
	
	@BeforeClass
	public void classConfiguration() {
		web=new WebDriverUtility();
		property=new PropertiesFileUtility();
		excel=new ExecelUtility();
		jUtil=new JavaUtility();
		
		property.propertyConfig(IConstantPath.PROPERTIES_PATH);
		String browser=property.fetchProperty("browser");
		String url=property.fetchProperty("url");
		long time=Long.parseLong(property.fetchProperty("time"));
		driver=web.openApplication(browser, url, time);
		
		}
	@BeforeMethod
	public void methodConfiguration() {
		excel.excelInitialization(IConstantPath.EXCEL_PATH);
		
		home=new HomePage(driver);
		demoApp=new SkillraryDemoAppPages(driver);
		selenium=new SeleniumTraining(driver);
		testing=new TestingPage(driver);
		contact=new ContactUsPage(driver);
	}
	@AfterMethod
	public void methodTearDown() {
		excel.closeworkbook();
	}
	@AfterClass
	public void classTearDown() {
		web.quitBrowser();
	}
	//@AfterTest
	//@AfterSuite
	
	

}
