package Commandsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe" );
      WebDriver driver=new ChromeDriver();
      driver.navigate().to("http://demo.automationtesting.in/Register.html");
      driver.manage().window().maximize();
      List<WebElement>linklist=driver.findElements(By.tagName("a"));
      System.out.println("Number of links :"+linklist.size());
      
      for(int i=0;i<linklist.size();i++){
    	  System.out.println("link names are:"+linklist.get(i).getText());
    	  
      }

      driver.close();
	}

}
