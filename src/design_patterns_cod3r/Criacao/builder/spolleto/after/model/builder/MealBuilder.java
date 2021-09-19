package design_patterns_cod3r.Criacao.builder.spolleto.after.model.builder;

import design_patterns_cod3r.Criacao.builder.spolleto.after.model.Size;

import java.util.List;

public interface MealBuilder {

	void setSize(Size size);
	void setSauce(List<String> sauces);
	void setToppings(List<String> toppings);
	void setCheese(boolean cheese);
	void setPepper(boolean pepper);
}
