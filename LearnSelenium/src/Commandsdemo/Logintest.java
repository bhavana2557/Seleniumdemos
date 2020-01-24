package Commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("Email")).sendKeys("jarugula@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("bhavana123");
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	//driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	String expectedname="Demo Web Shop";
	String actualname=driver.getTitle();
	System.out.println(actualname);
	int lengthofname=actualname.length();
	System.out.println(lengthofname);
	if(expectedname.equals(actualname)){
		System.out.println("u are in correct page");
		}else{
			System.out.println("incorrect page");
		}
	String ExpURL="www.Demowebshop";
	String actualURL=driver.getCurrentUrl();
	System.out.println(actualURL);
	if(ExpURL.equals(actualURL)){
		System.out.println("u are in correct URL");
	}else{
		System.out.println("incorrect URL");
	}
	String actualsp=driver.getPageSource();
	int lengthofsp=actualsp.length();
	System.out.println(lengthofsp);
	//System.out.println(actualsp);
	driver.close();
	
	}

}
