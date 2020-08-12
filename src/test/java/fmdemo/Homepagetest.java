package fmdemo;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Homepagetest {
Homepageobject hp;
WebElement web;
	public Homepagetest(){
		hp= new Homepageobject();
	}
	@Test
	public void Verifylogin() {
		hp.getloginid().sendKeys("Admin");
		hp.getpassw().sendKeys("admin123");
		hp.getlgnbtn().click();
		
		web.isEnabled();
		hp.elementFound(web);
		Assert.assertTrue(hp.getwel().getText().contains("Admin"));
	}

}
