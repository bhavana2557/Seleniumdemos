package Commandsdemo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowdemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		 String parentWindowHandle = driver.getWindowHandle();
		 System.out.println("Parent window's handle -> " + parentWindowHandle);
		 WebElement clickElement = driver.findElement(By.id("button1")); 
		 
		 for(int i = 0; i < 3; i++)
		 {
		 clickElement.click();
		 
		 Thread.sleep(3000);
		 }
		 
		 Set<String> allWindowHandles = driver.getWindowHandles();
		 
		 for(String handle : allWindowHandles)
		 {
		 System.out.println("Switching to window - > " + handle);
		 System.out.println("Navigating to google.com");
		 driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
		 driver.get("http://google.com");
		 }
		 
		 
	}

}
