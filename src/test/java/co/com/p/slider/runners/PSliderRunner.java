package co.com.p.slider.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/pslider.feature",
        glue = "co/com/p/slider/stepdefinitions"
)
public class PSliderRunner {
}
