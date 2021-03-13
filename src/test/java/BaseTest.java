import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Feature",
        glue = {"Steps"},
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true,
        strict = true
)

public class BaseTest {
}
