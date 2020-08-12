package fmdemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepageobject extends Basepage {
	@FindBy(id="txtUsername")
	private WebElement loginid;
	@FindBy(id="txtPassword")
	private WebElement passw;
	@FindBy(id="btnLogin")
	private WebElement lgnbtn;
	@FindBy(id="welcome")
	private WebElement wel;

	public Homepageobject() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getloginid() {
		return loginid;
	}
	public WebElement getpassw() {
		return passw;
	}
	public WebElement getlgnbtn() {
		return lgnbtn;
	}
	public WebElement getwel() {
		return wel;
	}
		
	}

	

