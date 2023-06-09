package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generalLibraries.BaseClass;

public class Test2 extends BaseClass {
	
		@Test
		
	public void test2(){
		SoftAssert soft=new SoftAssert();
		home.clickGearsTab();
		home.clickskillraryDemoApp();
		web.handleChildBrowser();
		
		soft.assertEquals(demoApp.getPageHeader(), "SkillRary-Ecommerce");
		demoApp.selectCategory(web,1);
		
		soft.assertEquals(testing.getPageHeader(),"Testing");
		
		web.dragAndDropElement(testing.getSeleniumTrainingImage(),testing.getCartArea());
		web.scrollTillElement(testing.getFacebookIcon());
		
		testing.clickFacebookIcon();
		
		soft.assertAll();
		
		

	

	}
}
