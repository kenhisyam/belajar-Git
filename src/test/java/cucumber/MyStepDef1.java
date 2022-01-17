package cucumber;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class MyStepDef1 {

    WebDriver driver = new ChromeDriver();
    //string title = driver.getTitle();



    WebDriverWait wait = new WebDriverWait(driver,3);
    WebElement fieldEmail = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
    WebElement fieldPassword = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("passwd")));
    WebElement buttonSubmit = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("SubmitLogin")));

    @Before
    public void openBrowser () {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        //driver = new ChromeDriver();
    }

    @Given("I on the login page")
    public void iOnTheLoginPage() {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://qa.cilsy.id:31300/id/");

    }

    @When("I input field email")
    public void iInputFieldEmail() throws InterruptedException{
        WebElement fieldEmail = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
        assertTrue(fieldEmail.isDisplayed());

        fieldEmail.sendKeys("ahmadbejo@gmail.com");
    }

    @And("I input field pasword")
    public void iInputFieldPasword() throws InterruptedException{
        WebElement fieldPassword = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("passwd")));
        assertTrue(fieldPassword.isDisplayed());

        fieldPassword.sendKeys("ahmadbejo12345");
    }

    @Then("I click button Sign in")
    public void iClickButtonSignIn() {
        WebElement SubmitSign = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SubmitLogin\"]")));

        SubmitSign.submit();
    }

    @Then("There should be validation")
    public void thereShouldBeValidation() {
        assertTrue(fieldEmail.isDisplayed());
        assertTrue(buttonSubmit.isEnabled());


    }
}
