package BProject.BigProject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BProject {
	WebDriver driver = null;
	
	@Before
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\BrowserDrivers\\chromedriver.exe");
        String userProfile = "C:\\Selenium\\BrowserProfile";
        ChromeOptions option = new ChromeOptions();
        option.addArguments("user-data-dir=" + userProfile);
        option.addArguments("--start-maximized");
        driver = new ChromeDriver(option);
	}
	
	@Test
	public void testinglogin() throws InterruptedException {
		System.out.println("test login");
		driver.get("https://staging.cicle.app/");
		WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement SubmitSign = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/a[1]/div")));
        SubmitSign.click();
        Thread.sleep(1000);
        
        driver.get("https://staging.cicle.app/schedules/620dd58cedc86b92d3c96edf");
        WebElement SubmitComent = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[3]/div[3]/div/div/div/div[2]/div[2]/div")));
        SubmitComent.click();
        Thread.sleep(1000);
        
        WebElement ComentClick = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[5]/div/div/div/div[1]/div[1]/div[2]/form/input")));
        ComentClick.click();
        Thread.sleep(1000);
        
        
        WebElement fieldComent = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[5]/div/div/div/div[1]/div/div[2]/form/div[1]/div/div[3]/div/p")));
        fieldComent.sendKeys("ganti hari libur nya");
        Thread.sleep(1000);
        
        //driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[5]/div/div/div/div[1]/div/div[2]/form/div[2]/div/button")).click();
        Thread.sleep(1000);
		
		
	}
	
	@Test
	public void fiturHQ () throws InterruptedException {
		System.out.println("Schedule feature");
		driver.get("https://staging.cicle.app/");
		//WebElement SubmitSign = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/a[1]/div")));
		
		Thread.sleep(1500);
	}
	
	
	
	
	
	@After
	public void afterTest() {
		System.out.println("setelah testing");
		driver.close();
		
	}
}