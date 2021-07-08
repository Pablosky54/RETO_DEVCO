package com.co.devco.task;

import com.co.devco.models.DataStay;
import com.co.devco.ui.HomePage;
import com.co.devco.ui.StayPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class CompletStay implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(HomePage.STAY)
                , WaitUntil.the(StayPage.GOING_TO, WebElementStateMatchers.isEnabled())
                , Enter.theValue(new  DataStay().getplace()).into(StayPage.GOING_TO)
                , WaitUntil.the(StayPage.BTN_SEARCH, WebElementStateMatchers.isEnabled())
                ,Click.on(StayPage.BTN_SEARCH)

        );

    }

    public static CompletStay with() {
        return Tasks.instrumented(CompletStay.class);
    }
}
