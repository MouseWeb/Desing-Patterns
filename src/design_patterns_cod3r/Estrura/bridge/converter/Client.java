package design_patterns_cod3r.Estrura.bridge.converter;

import design_patterns_cod3r.Estrura.bridge.converter.converters.CSVConverter;
import design_patterns_cod3r.Estrura.bridge.converter.converters.Converter;
import design_patterns_cod3r.Estrura.bridge.converter.converters.JsonConverter;
import design_patterns_cod3r.Estrura.bridge.converter.employees.ITGuy;
import design_patterns_cod3r.Estrura.bridge.converter.employees.ProjectManager;

/* O padrão é um brinde e como o nome diz é ponte.
   O objetivo dele é conectar dois lados: eu tenho um lado e um outro lado e a ponte exatamente facilitar.
   comunição de dois aspectos são muito importantes (comunição entre classes concretas) - ponte baseada em interface!
   A partir de interfaces você consegue criar essa ponte fazendo com que você consiga variar as implementações.
   Desacopla uma abstração de sua implementação para que os dois possam variar independentemente - GOF.
 */
public class Client {

	public static void main(String[] args) {
		Converter csvConverter = new CSVConverter();
		Converter jsonConverter = new JsonConverter();

		ITGuy it = new ITGuy("Maurice Moss", 32, 4000d);
		ProjectManager pm = new ProjectManager("Jen Barber", 40, 6000d);
		
		System.out.println(csvConverter.getEmployeeFormated(it));
		System.out.println(jsonConverter.getEmployeeFormated(it));
		System.out.println(csvConverter.getEmployeeFormated(pm));
		System.out.println(jsonConverter.getEmployeeFormated(pm));
	}
}
