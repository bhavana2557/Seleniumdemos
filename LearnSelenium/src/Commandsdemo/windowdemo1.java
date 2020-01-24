package Commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowdemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		 WebElement clickElement = driver.findElement(By.id("button1")); 
		 
		 for(int i = 0; i < 3; i++)
		 {
		 clickElement.click();
		 System.out.println(clickElement);
		// Thread.sleep(2000);
		 }
		 

	}

}
