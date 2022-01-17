import io.cucumber.java.Status;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

public class selleniumSP2 {
    private boolean staus;

    @Test
    public void SPTC_02() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://qa.cilsy.id:31300/id/");


        WebDriverWait wait = new WebDriverWait(driver, 3);

        System.out.println("SPTC01 = berhasil di jalankan");
        Thread.sleep(4000);
        driver.close();
    }

    @Test
    public void SPTC_01() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://qa.cilsy.id:31300/id/");

        //Email-Password
        //WebElement LoginButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("hide_xs")));

        driver.findElement(By.className("hide_xs")).click();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement fieldEmail = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
        WebElement fieldPassword = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("passwd")));
        WebElement SubmitSign = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SubmitLogin\"]")));


        assertTrue(fieldEmail.isDisplayed());
        assertTrue(fieldPassword.isDisplayed());

        fieldEmail.sendKeys("ahmadbejo@gmail.com");
        fieldPassword.sendKeys("ahmadbejo12345");
        SubmitSign.submit();


        Thread.sleep(3000);

        //WebElement Home = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"center_column\"]/ul/li/a/span/i")));
        //Home.click();

        System.out.println("SPTC02 = berhasil di jalankan");

        Thread.sleep(4000);
        driver.close();


    }

    @Test
    public void SPTC_03() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://qa.cilsy.id:31300/id/");

        WebDriverWait wait = new WebDriverWait(driver, 3);
        driver.findElement(By.className("shopping_cart")).click();

        System.out.println("SPTC03 = berhasil di jalankan");
        Thread.sleep(4000);
        driver.close();

    }


  @Test
    public void SPTC_04() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

       WebDriver driver = new ChromeDriver();
       driver.get("http://qa.cilsy.id:31300/id/");

       WebDriverWait wait = new WebDriverWait(driver, 3);
       driver.get("http://qa.cilsy.id:31300/id/the-hotel-prime/2-super-delux-rooms.html");

       driver.findElement(By.xpath("//*[@id=\"hotelRoomsBlock\"]/div/div[2]/div/div[1]/div[1]/div/div[3]/a")).click();



        System.out.println("SPTC03 = berhasil di jalankan");
        Thread.sleep(4000);
        driver.close();
    }
}

