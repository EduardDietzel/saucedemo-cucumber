package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"steps"},
//        tags = {"@login"}
//        tags = {"@checkout"}
        tags = {"@inventory-5"}

        // если запускать все тесты кроме определенного, пишем так: tags = {"~@login-2"}
)

public class RunnerTest {
}
