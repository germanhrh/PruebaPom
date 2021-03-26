package Avianca;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features", tags = "@ConsultaAvianca"
        //glue={"com.automationpractice.testing.testautomation.stepdefinitions"}
)

public class RunnerTags {


}

