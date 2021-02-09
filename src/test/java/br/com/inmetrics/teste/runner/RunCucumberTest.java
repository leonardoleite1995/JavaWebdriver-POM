package br.com.inmetrics.teste.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/br/com/inmetrics/teste/features"},
        glue = {"br.com.inmetrics.teste.stepDefinitions"},
        monochrome = true
)

public class RunCucumberTest {
}