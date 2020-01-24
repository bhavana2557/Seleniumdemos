package Commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();

	}

}
