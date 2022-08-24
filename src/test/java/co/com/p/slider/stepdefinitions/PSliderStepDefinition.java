package co.com.p.slider.stepdefinitions;

import co.com.p.slider.tasks.Slider;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PSliderStepDefinition {

    @Given("that {string} open the browser and enter the page {string}")
    public void that_open_the_browser_and_enter_the_page(String nameactor, String url) {
        setTheStage(new OnlineCast());
        theActorCalled(nameactor).wasAbleTo(Open.url(url));
    }

    @When("she select the elemnt option and the category slider she will be able to click and slide the mouse")
    public void she_select_the_elemnt_option_and_the_category_slider_she_will_be_able_to_click_and_slide_the_mouse(Map<String,String> mapSlider) {
            theActorInTheSpotlight().attemptsTo(Slider.inThePage(mapSlider));
    }
    @Then("she should see on the screen the number where the mouse slides")
    public void she_should_see_on_the_screen_the_number_where_the_mouse_slides(Map<String,String>mapSlider) {

    }
}
