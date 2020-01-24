package Commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registrationtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("krthik12");
		driver.findElement(By.id("LastName")).sendKeys("123kk");
		driver.findElement(By.id("Email")).sendKeys("hello12398@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("hello123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("hello123");
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.close();
	}

}
