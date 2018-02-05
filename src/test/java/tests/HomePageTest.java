package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class HomePageTest {
	private WebDriver driver;
	Properties prop=new Properties();
	
  @Test
  public void flightbook() throws IOException {
	  
	driver.get(prop.getProperty("URL"));
		
  }
  
  @BeforeMethod
public void load() throws IOException{
	
	  System.setProperty("webdriver.chrome.driver",prop.getProperty("pathToDriverExe"));

	  driver=new ChromeDriver();
	  
  }
  
  
  @BeforeTest
  public void beforeTest() throws IOException {
  
	  
	  File propfile=new File("C:\\Users\\Reddeppa.vavilthota\\eclipse-workspace\\Assignment2\\src\\main\\java\\config\\config.properties");
	  FileInputStream fis=new FileInputStream(propfile);
	  prop.load(fis);
  }

  @AfterTest
  public void afterTest() {
  }

}
