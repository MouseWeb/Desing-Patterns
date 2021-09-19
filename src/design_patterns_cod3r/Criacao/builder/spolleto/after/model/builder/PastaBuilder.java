package design_patterns_cod3r.Criacao.builder.spolleto.after.model.builder;

import design_patterns_cod3r.Criacao.builder.spolleto.after.model.Pasta;

public class PastaBuilder extends MealBuilderOpt {

	public Pasta getResult() {
		return new Pasta(toppings, sauces, size, cheese, pepper);
	}
}
