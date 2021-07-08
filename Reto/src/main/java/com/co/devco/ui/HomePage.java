package com.co.devco.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target STAY = Target.the("Boton Stay")
            .locatedBy("//span[@class='uitk-tab-text'][contains(text(),'Stays')]");

    public static final Target FLIGHTS = Target.the("Boton Flights")
            .locatedBy("//span[@class='uitk-tab-text'][contains(text(),'Flights')]");

    public static final Target CARS = Target.the("Boton Cars")
            .locatedBy("//span[@class='uitk-tab-text'][contains(text(),'Cars')]");

    public static final Target PACKAGES = Target.the("Boton Packages")
            .locatedBy("//span[@class='uitk-tab-text'][contains(text(),'Packages')]");

    public static final Target THINGS = Target.the("Boton Things to do")
            .locatedBy("//span[@class='uitk-tab-text'][contains(text(),'Things to do')]");

    public static final Target LANGUAGE = Target.the("Boton Language")
            .locatedBy("//div[@class='uitk-text uitk-type-300'][contains(text(),'Espa')]");
}
