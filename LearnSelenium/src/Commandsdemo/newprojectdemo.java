package Commandsdemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class newprojectdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		//driver.close();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait mywait=new WebDriverWait(driver,10);
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		System.out.println("end");
	
			}
	}


