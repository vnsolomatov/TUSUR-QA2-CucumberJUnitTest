import org.junit.runner.RunWith;
 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/equilateral","src/test/java/isosceles","src/test/java/mathcalculator"})
public class RunnerTest {
  
}
