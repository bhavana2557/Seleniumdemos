package Commandsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Logintesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM\\Desktop\\testing\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
         driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("vinay");
         driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kumar");
         driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("xyz,290380");
         driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("vinay123@gmail.com");
        driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys("930247280");
      driver.findElement(By.xpath("//label[2]")).click();
        driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
        driver.findElement(By.xpath("//div[@id='msdd']"));
        WebElement skill=driver.findElement(By.xpath("//select[@id='Skills']"));
        Select sk=new Select(skill);
        sk.selectByValue("C");
        WebElement countries=driver.findElement(By.xpath("//select[@id='countries']"));
        Select co=new Select(countries);
        co.selectByVisibleText("India");
       WebElement selectcountry=driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
        Select sco=new Select(selectcountry);
        sco.selectByValue("India");
        WebElement year=driver.findElement(By.id("yearbox"));
    	Select sell=new Select(year);
    	sell.selectByValue("1998");
    	WebElement Month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
    	Select mon=new Select(Month);
    	mon.selectByValue("March");
    WebElement day=driver.findElement(By.id("daybox"));
    	Select da=new Select(day);
    	da.selectByVisibleText("9");
        driver.findElement(By.id("firstpassword")).sendKeys("hello123");
        driver.findElement(By.id("secondpassword")).sendKeys("hello123");
        driver.findElement(By.id("submitbtn")).click();
    //     driver.close();
	}

}
