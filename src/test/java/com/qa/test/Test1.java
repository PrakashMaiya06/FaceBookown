package com.qa.test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.qa.Base.Base;
import com.qa.page.LoginPage;

   public class Test1  extends Base {

	public Test1() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	LoginPage log;
     @BeforeClass
     public void setup() {
	init();
	try {
		log=new LoginPage();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
}
      @Test
      public void validatetitle() {
	  String s=log.valtitle();
	  System.out.println("title of the page is : " +s);
}
      @Test
      public void logindata() {
	  log.fname("firstname", "lastname","password", "mail");
	
}
      @Test
      public void radio() {
	  log.rbutton();
	  
	  Assert.assertTrue(true);
}
      @Test
      public void submit() {
	  log.submit();
}

}