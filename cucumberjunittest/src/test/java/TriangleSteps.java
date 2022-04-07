import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TriangleSteps {
    WebDriver driver; 
     
    @Given("^I launch https://www.calculator.net/triangle-calculator.html$")
    public void i_launch() throws Exception {   	
    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("https://www.calculator.net/triangle-calculator.html");
    }
    @When("^I press Clear button$")
    public void i_clear() throws Exception {
    	driver.findElement(By.cssSelector(".clearbtn")).click();
    }                 
    @And("^I enter \"2\" into field of side a$")
    public void i_enter_a() throws Exception {
    	driver.findElement(By.name("vy")).click();
        driver.findElement(By.name("vy")).sendKeys("2");
    } 
    @And("^I enter \"2\" into field of side b$")
    public void i_enter_b() throws Exception {
    	driver.findElement(By.name("vx")).click();
        driver.findElement(By.name("vx")).sendKeys("2");
    } 
    @And("^I enter \"1\" into field of side c$")
    public void i_enter_c() throws Exception {
    	driver.findElement(By.name("vz")).click();
        driver.findElement(By.name("vz")).sendKeys("1");
    } 
    @And("^I press Calculate button$")
    public void i_calculate() throws Exception {
        driver.findElement(By.cssSelector("tr:nth-child(5) input")).click();
    } 
    @Then("^Expected result is \"Acute Isosceles Triangle\"$")
    public void result() throws Exception {
    	Assertions.assertEquals(driver.findElement(By.cssSelector("td > h3")).getText(),"Acute Isosceles Triangle");
    	driver.close();
     }
}
