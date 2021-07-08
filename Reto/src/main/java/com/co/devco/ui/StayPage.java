package com.co.devco.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class StayPage {

    public static final Target GOING_TO = Target.the("In going to")
            .located(By.id("location-field-destination"));

    public static final Target CHECK_IN = Target.the("Check In")
            .located(By.id("d1-btn"));

    public static final Target BTN_SEARCH = Target.the("Boton Buscar")
            .locatedBy("//button[contains(text(),'Search')]");

    public static final Target PRICE = Target.the("Price")
            .locatedBy("//span[@class='uitk-cell loyalty-display-price all-cell-shrink'][contains(text(),'${0}')]");
}
