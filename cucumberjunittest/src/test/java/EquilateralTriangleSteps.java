import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class EquilateralTriangleSteps {
    WebDriver driver; 
     
    @Given("^I launch https://www.calculator.net/triangle-calculator.html$")
    public void i_launch() {
    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("https://www.calculator.net/triangle-calculator.html");
    }
    @When("^I press Clear button$")
    public void i_clear() {
    	driver.findElement(By.cssSelector(".clearbtn")).click();
    }                 
    @And("^I enter \"2\" into field of side a$")
    public void i_enter_a() {
    	driver.findElement(By.name("vy")).click();
        driver.findElement(By.name("vy")).sendKeys("2");
    } 
    @And("^I enter \"2\" into field of side b$")
    public void i_enter_b() {
    	driver.findElement(By.name("vx")).click();
        driver.findElement(By.name("vx")).sendKeys("2");
    } 
    @And("^I enter \"2\" into field of side c$")
    public void i_enter_c() {
    	driver.findElement(By.name("vz")).click();
        driver.findElement(By.name("vz")).sendKeys("2");
    } 
    @And("^I press Calculate button$")
    public void i_calculate() {
        driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    } 
    @Then("^Expected result is \"Equilateral Triangle\"$")
    public void result() {
    	Assertions.assertEquals(driver.findElement(By.cssSelector("td > h3")).getText(),"Equilateral Triangle");
    	driver.close();
     }
}
