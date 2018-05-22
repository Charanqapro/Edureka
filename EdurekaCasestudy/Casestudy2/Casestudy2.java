package Casestudy2;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Casestudy2 {

	
	
	
	ChromeDriver driver;
	String url = "https://www.edureka.co";
	
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Edrivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	
		driver.get(url);
		
	}
	
	public void Search() 
	{
		
	
	driver.findElement(By.id("homeSearchBar")).sendKeys("selenium");
	try {
		Thread.sleep(1200);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	driver.findElement(By.id("homeSearchBar")).sendKeys(Keys.ENTER);
	
	//driver.findElement(By.xpath(".//*[@id='homeSearchBarIcon']")).click();
	
	WebDriverWait waitElement = new WebDriverWait(driver,120);
	waitElement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='course-box-535']/div/div[1]/div[3]/div[1]/h3/a"))).click();
	try {
		Thread.sleep(1200);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	String title = driver.getTitle();
	System.out.println(title);
	driver.navigate().back();
	
	driver.findElement(By.id("dropdownMenu1")).click();
	try {
		Thread.sleep(1200);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
	
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Casestudy2 cs=new Casestudy2();
		cs.invokeBrowser();
		 cs.Search();
		
	}

}
