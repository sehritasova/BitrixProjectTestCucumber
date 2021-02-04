package com.Bitrix.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Bitrix/Login",
        glue="com/Bitrix/step_definitions",
        dryRun = false,
        tags="@login_with_valid_credentials"

)

public class CucumberRunner {
}
