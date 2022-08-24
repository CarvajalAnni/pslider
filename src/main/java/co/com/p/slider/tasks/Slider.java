package co.com.p.slider.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Map;

import static co.com.p.slider.userinterfaces.PSlideHome.BTN_SLIDER;
import static co.com.p.slider.userinterfaces.PSlideHome.BTN_WIDGETS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class Slider implements Task {

    private final Map<String,String > mapSlider;

    public static Slider inThePage(Map<String,String > mapSlider){
        return instrumented(Slider.class, mapSlider);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BTN_WIDGETS));
        actor.attemptsTo(Click.on(BTN_WIDGETS));
        actor.attemptsTo(Scroll.to(BTN_SLIDER));

    }
}
