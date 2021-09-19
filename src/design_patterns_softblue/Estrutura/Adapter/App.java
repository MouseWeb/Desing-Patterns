package design_patterns_softblue.Estrutura.Adapter;

public class App {

	/* Converter a interface de uma classe em outra interface, esperada pelos cliente.
	 * O Adapter permite que classes com interfaces incompatíveis trabalhem em conjunto
	 * o que, de outra forma, seria impossível.
	 * Adapter: Fazer uma adaptação entre duas coisas em que não se conversa, para que troque informações consistentes.
	 *          Traduz a informação afim que as duas pontas possa conversar.*/

	public static void main(String[] args) {

//		TemperatureClassAdapter adapter = new TemperatureClassAdapter();
//		adapter.setValue(30);

//		System.out.println(adapter.getValue());
//		System.out.println(adapter.getValueInFahrenheit());
		
		Temperature temperature = new Temperature();
		//temperature.setValue(30);

		TemperatureObjectAdapter adapter = new TemperatureObjectAdapter(temperature);
		adapter.setValue(30);
		
		System.out.println(adapter.getValue());
		System.out.println(temperature.getValue());
	}
}
