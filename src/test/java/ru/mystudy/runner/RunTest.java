package ru.mystudy.runner;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"ru.mystudy.stepDefinitions", "ru.mystudy.typeRegistry", "ru.mystudy.hooks"})
        //plugin = "json:target/cucumber-reports/CucumberTestReport.json"
public class RunTest extends AbstractTestNGCucumberTests {
}
