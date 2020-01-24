package Commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	//	driver.get("http://demowebshop.tricentis.com/computers");
		//driver.findElement(By.xpath("//a[contains(text(),'Computers')]//parent::li//parent::ul//child::li//a[contains(text(),'Electronics')]")).click();
	//	driver.findElement(By.xpath("//a[contains(text(),'WebTable')]//parent::li//following-sibling::li[1]//child::a[contains(text(),'SwitchTo')]")).click();
	//driver.findElement(By.xpath("//a[contains(text(),'WebTable')]//parent::li//preceding-sibling::li[1]//child::a[contains(text(),'Register')]")).click();
   //driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]//parent::li//child::ul//li//a")).click();
  // driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]//ancestor::li//preceding-sibling::li//a[contains(text(),'WebTable')]")).click();
 //  driver.findElement(By.xpath("//*[@class='nav navbar-nav']//descendant::a")).click();
	
 driver.findElement(By.xpath("a[contains(text(),'SwitchTo')]//ancestor::ul//child::li[3]//a[contains(text(),'WebTable')]")).click();
	}

}
