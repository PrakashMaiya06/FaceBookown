package com.qa.page;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.Base;

public class LoginPage extends Base{

	
	@FindBy(xpath="//img[@class='fb_logo _registrationPage__fbLogo img']")
	WebElement title;
	

	@FindBy(xpath="//input[@name='firstname']")
	WebElement Fname;  
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lname;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	WebElement rpass;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	WebElement regmail;
	
	@FindBy(xpath="//label[text()='Custom']")
	WebElement rbutton;
	
	@FindBy(xpath="//button[@name='websubmit']")
	WebElement submit;
	
	@FindBy(xpath="//a[text()='Already have an account?']")
	WebElement alacc;
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
    public String valtitle() {
	 return driver.getTitle();
}
    public void fname(String un , String ln , String pw , String mail) {
	 Fname.sendKeys(un);
	 lname.sendKeys(ln);
	 rpass.sendKeys(pw);
	 regmail.sendKeys(mail);
}
    public void rbutton() {
    	
	 rbutton.click();
}
    public void submit() {
	 submit.click();
}



}
