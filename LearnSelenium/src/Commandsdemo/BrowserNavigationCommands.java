package Commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver.get("http://demowebshop.tricentis.com/login");
		driver.navigate().to("http://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().to("http://demowebshop.tricentis.com");
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
		

	}

}
