package design_patterns_cod3r.Criacao.builder.meal.after;

import design_patterns_cod3r.Criacao.builder.meal.after.builder.FastFoodMealBuilder;
import design_patterns_cod3r.Criacao.builder.meal.after.builder.FatMealBuilder;
import design_patterns_cod3r.Criacao.builder.meal.after.builder.JustFriesBuilder;
import design_patterns_cod3r.Criacao.builder.meal.after.builder.Menu1Builder;
import design_patterns_cod3r.Criacao.builder.meal.after.builder.Menu2Builder;
import design_patterns_cod3r.Criacao.builder.meal.after.director.MealDirector;

public class Client {
	
	public static void order(String name, FastFoodMealBuilder builder) {
		System.out.println("Ordering a " + name);
		MealDirector director = new MealDirector(builder);
		director.constructCombo();
		System.out.println(director.getCombo());
		
		System.out.println("------------------");
	}

	public static void main(String[] args) {
		order("Burguer", new Menu1Builder());
		order("Veggie Burguer", new Menu2Builder());
		order("Just Fries", new JustFriesBuilder());
		order("Heart Atack", new FatMealBuilder());
	}
}