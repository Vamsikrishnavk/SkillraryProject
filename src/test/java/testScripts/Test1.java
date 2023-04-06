package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generalLibraries.BaseClass;


public class Test1 extends BaseClass {
	@Test
	
	public void test1(){
		SoftAssert soft=new SoftAssert();
        
		home.clickGearsTab();
		home.clickskillraryDemoApp();
		web.handleChildBrowser();
		soft.assertEquals(demoApp.getPageHeader(),"SkillRary-ECommerence");
		
		
		demoApp.mouseHoverToCourse(web);
		demoApp.clickSeleniumTraining();
		
		soft.assertEquals(selenium.getPageHeader(),"Selenium Training");
		selenium.doubleClickAdd(web);
		selenium.clickAddToCart();
		
		web.handleAlert("Ok");
		soft.assertEquals(selenium.getItemAddedMessage(),"Item added to cart");
		
		soft.assertAll();
		}		
	}


