package com.co.devco.interactions;



import java.util.Collections;
import java.util.List;


import com.co.devco.utils.Replace;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class ComparePrice implements Task {

	private Target target;


	public ComparePrice() {
	}
	
	public ComparePrice(Target target) {
		this.target = target;
			}

	public ComparePrice newIntance(){		
		ComparePrice compaire = new ComparePrice();
		return compaire;
		
	}


	@Override
	@Step("{0} chose a most cheap option")
	public <T extends Actor> void performAs(T actor) {

		List<Integer> prices = Replace.change(target, actor);
		Collections.sort(prices);		
		actor.attemptsTo(Click.on(target.of(prices.get(0).toString())));
		


	}

	
	public static ComparePrice with(Target target) {

		return Tasks.instrumented(ComparePrice.class, target);
	}



}
