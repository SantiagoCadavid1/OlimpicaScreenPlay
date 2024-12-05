package com.olimpica.runners;

import com.olimpica.utils.BeforeSuite;
import com.olimpica.utils.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(
        features = "src/test/resources/features/",
        tags = "@RegistrarUsuario",
        glue = "com.olimpica.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
@RunWith(RunnerPersonalizado.class)
public class RegistrarUsuarioRunner {

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/registrarUsuario.feature");
    }

}
