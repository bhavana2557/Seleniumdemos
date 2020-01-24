package Commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/IBM/Desktop/Tools.html");
	System.out.println(	driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td[2]")).getText());
	    driver.close();
	}

}
