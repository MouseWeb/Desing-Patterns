package design_patterns_cod3r.Criacao.builder.meal.fluent;

import design_patterns_cod3r.Criacao.builder.meal.fluent.model.FastFoodMeal;
import design_patterns_cod3r.Criacao.builder.meal.fluent.model.builder.FastFoodMealBuilder;

public class Client {

	public static void main(String[] args) {
		FastFoodMeal burguerCombo = new FastFoodMealBuilder("Fries")
				.andMain("CheeseBurger")
				.forDrink("Code")
				.thatsAll();
		System.out.println(burguerCombo);
		
		FastFoodMeal justFries = new FastFoodMealBuilder("Fries").thatsAll();
		System.out.println(justFries);
		
		FastFoodMeal heartAtackCombo = new FastFoodMealBuilder("Large Fries")
				.andMain("Monster Burguer")
				.forDrink("Milk Shake")
				.andDessert("Fudge Cake")
				.andGift("2 Kilograms")
				.thatsAll();
		System.out.println(heartAtackCombo);
	}
}
