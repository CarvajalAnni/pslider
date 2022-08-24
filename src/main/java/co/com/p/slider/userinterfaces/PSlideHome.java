package co.com.p.slider.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PSlideHome {

    public static final Target BTN_WIDGETS = Target.the("botón opción de widgets").located(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]/div/div[3]/h5"));
    public static final Target BTN_SLIDER = Target.the("botón opción de slider").located(By.xpath("//*[@id=\"item-3\"]"));
    public static final Target BTN_SLIDE = Target.the("Botón slide").located(By.xpath(""));

}
