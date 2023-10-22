package cucumber.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AddProduct {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com";

    @Given("User on Products page")
    public void user_on_products_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl);
        // LOGIN
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    }

    @When("User click add button")
    public void user_click_add_button() {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
    }

    @Then("The number on the cart increases")
    public void the_number_on_the_cart_increases() {
        boolean isBadgeDisplayed = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).isDisplayed();
        Assert.assertEquals(isBadgeDisplayed, true);
    }
}
