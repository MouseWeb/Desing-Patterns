package design_patterns_cod3r.Criacao.builder.spolleto.after.model.builder;

import design_patterns_cod3r.Criacao.builder.spolleto.after.model.Salad;

public class SaladBuilder extends MealBuilderOpt {

	public Salad getResult() {
		return new Salad(toppings, sauces, size, cheese, pepper);
	}
}
