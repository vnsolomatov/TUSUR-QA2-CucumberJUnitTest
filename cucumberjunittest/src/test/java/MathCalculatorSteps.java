import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class MathCalculatorSteps {
    WebDriver driver; 
     
    @Given("^I launch https://www.calculator.net$")
    public void i_launch() {
    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("https://www.calculator.net");
    }
    @When("^I switch on Math Calculators$")
    public void i_switch_on_math() {
    	driver.findElement(By.xpath("//a[contains(text(),'Math')]")).click();
    }                 
    @And("^I click \"AC\" button$")
    public void i_clear_all_fields() {
    	driver.findElement(By.xpath(".//*[text()='AC']/..")).click();
    } 
    //@And("^I enter \"2\"$")
    //public void i_enter_operand() {
    	//driver.findElement(By.className("scinm")).sendKeys("2");
    //} 
    @Then("^Expected result is \"0\"$")
    public void result() {
    	Assertions.assertEquals(driver.findElement(By.id("sciOutPut")).getText(),"0");
    	driver.close();
    }
}
