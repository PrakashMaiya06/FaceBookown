package com.qa.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Base {
 public static WebDriver driver;
 public static Properties prop;
 
 public Base() throws IOException {
	 prop=new Properties();
	
		FileInputStream fis=new FileInputStream("C:\\Users\\91991\\eclipse-workspace\\ProjectDemo\\src\\main\\java\\com\\qa\\config\\config.property");
         prop.load(fis);
 }
 
 @SuppressWarnings("deprecation")
public static void init() {
	String browsername=prop.getProperty("browser");
	if(browsername.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91991\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
 }
 else {
	 System.out.println("no");
	 }
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS) ;
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
 
 }
 @AfterTest
 public void TearDown() {
	 driver.quit();
 }
 }
	 
	