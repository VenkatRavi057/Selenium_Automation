package Automation_Selenium;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
public class SeleniumIntro {

	public static void main(String[] args) throws InterruptedException {
				
		//WebDriver driver = new ChromeDriver();
		// For each browser there is a seperate Driver
//		WebDriver driver1 = new FirefoxDriver();
//		driver.get("https://www.youtube.com/");
//		System.out.println(driver.getTitle());
//		driver.close();
//		System.out.println("test success!");
//		String s = "Hello World!";
//		String[] split = s.split(" ");
//		for(String f:split) {
//			System.out.println(f);
	//	}
		
//		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("Venkat");
		driver.findElement(By.name("inputPassword")).sendKeys("Venkatesh");
		//driver.findElement(By.id("allowMarketingEmails")).click();
	//	driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
//		String s = "Rahul Shetty Academy";
//		System.out.println(driver.getTitle().equals(s));
//		System.out.println("Test Passed!");
		//driver.quit();
		 
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Venkat");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("venkat@gmail.com");
		//driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("09876556");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Luvu@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("09876556");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	//	System.out.println(
				//driver.findElement(By.xpath("//form/p")).getText();
		driver.findElement(By.className("go-to-login-btn")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//SeleniumIntro s = new SeleniumIntro();
		String pw = getPassword(driver);
		
		String name = "Leo";
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(pw);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		//Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You ar successfully logged in.");
	//	Assert.assertEquals(driver.findElements(By.cssSelector("div[class='login-container'] h2").ge, "Hello "+name+",");
		Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(),"Hello "+name+",");
		System.out.println(driver.findElement(By.xpath("//h2")).getText());
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		driver.quit();
		
		
		}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
				
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String getPassword = driver.findElement(By.cssSelector("form p")).getText();
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(2000);
		String password = getPassword.split("'")[1];
		System.out.println(password);
		return password;
//		for(String f: password) {
//			System.out.println(f);
//		}

	}

}
