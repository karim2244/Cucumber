package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features="C:\\Users\\Lenovo\\Cucumber\\Cucumber\\src\\main\\java\\facebook.feature",
        glue = {"Stepdefination"},
        plugin = {
        "pretty","html:C:\\Users\\Lenovo\\Cucumber\\Cucumber\\Cucumberreport/fblogin.html"
        },
        monochrome = true
)

@RunWith(Cucumber.class)


public class fbrunner {

}
