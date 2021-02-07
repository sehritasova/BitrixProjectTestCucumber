package com.Bitrix.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Bitrix",
        glue= "com/Bitrix/step_definitions",
        dryRun = false,
        tags="@smoke_login"

)

public class CucumberRunner {
}
