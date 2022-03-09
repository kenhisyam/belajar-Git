import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class TLabINSTAGRAM {
    @Test
    public void loginIG() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe") ;
        WebDriver driver = new ChromeDriver();

        //membuka Instagram
        driver.get("https://www.instagram.com/");

        //login akun instagram
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement fieldUsername = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")));
        WebElement fieldPassword = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")));
        WebElement buttonSubmit = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div")));

        assertTrue(fieldUsername.isDisplayed());
        assertTrue(fieldPassword.isDisplayed());

        //menampilkan data username dan password
        Thread.sleep(2000 );
        fieldUsername.sendKeys("fffnnndddi");
        fieldPassword.sendKeys("hisyam990216");
        buttonSubmit.submit();

        System.out.println("test01 = berhasil dijalankan");
        Thread.sleep(2000);

        WebElement notNow = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-root\"]/div/div/section/main/div/div/div/div/button")));
        notNow.click();

        WebElement Notification = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/div/div/div/div[3]/button[2]")));
        Notification.click();

        //membuka fitur pesan
        driver.get("https://www.instagram.com/direct/inbox/");

        //mengirim pesan
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/section/div/div[2]/div/div/div[1]/div[2]/div/div/div/div/div[1]/a")).click();

        //menulis isi pesan
        WebElement menulisPesan = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"react-root\"]/div/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[2]/textarea")));
        assertTrue(menulisPesan.isDisplayed());

        menulisPesan.sendKeys("hallo kak");

        //mengirimkan teks pesan
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/section/div/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/div[3]/button")).click();



    }

}
