import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Users/User/IdeaProjects/TeamCityAllure/src/test/resources/Tests/AddNewPetToTheStore.feature"},
        plugin = {"json:C:/Users/User/IdeaProjects/TeamCityAllure/target/cucumber-parallel/1.json"},
        monochrome = false,
        tags = {"@petsTests"},
        glue = {"Steps"})
public class Parallel01IT {
}
