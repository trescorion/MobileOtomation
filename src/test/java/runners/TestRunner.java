package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",         // feature dosyalarının yolu
        glue = "stepdefinitions",                         // step definition class'larının paketi
        plugin = {"pretty", "html:target/cucumber-report.html"}, // raporlama için
        monochrome = true                                 // daha okunabilir console çıktısı
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
