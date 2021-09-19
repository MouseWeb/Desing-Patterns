package design_patterns_softblue.Comportamento.Observer;

import design_patterns_softblue.Comportamento.Observer.gui.Window;

public class App {

	/* Define uma dependência um-para-muitos entre objetos, de modo que,
	 * quando um objeto muda de estado, todos os seus dependentes são
	 * automaticamente notificados e atualizados. */


	public static void main(String[] args) {
		
		ConsoleObserver observer = new ConsoleObserver();
		WeatherForecast.getInstance().registerObserver(observer);
		
		Window window = new Window("Temperatura", 300, 150);
		window.show();
	}
}
