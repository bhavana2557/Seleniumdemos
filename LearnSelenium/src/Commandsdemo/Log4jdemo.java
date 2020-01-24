package Commandsdemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jdemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Logger log=Logger.getLogger(Log4jdemo.class);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		
		log.info("application started");
		
		String expectedtitle=driver.getTitle();
		
		String actualtitle=driver.getTitle();
		log.info("check the title");
		if(expectedtitle.equals(actualtitle)){
			System.out.println("title is correct");
			
			
			log.info("correct page opened");
			driver.close();
		}else
		{
			System.out.println("Incorrect title");
			log.error("incorrect page");
			driver.close();
		}

	}

}
