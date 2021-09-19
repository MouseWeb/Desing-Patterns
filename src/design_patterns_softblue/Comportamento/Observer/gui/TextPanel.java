package design_patterns_softblue.Comportamento.Observer.gui;

import design_patterns_softblue.Comportamento.Observer.TextObserver;
import design_patterns_softblue.Comportamento.Observer.WeatherForecast;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextPanel extends JPanel {

	public TextPanel() {
		JTextField txtTemperature = new JTextField(20);
		txtTemperature.setEnabled(false);
		add(txtTemperature);
		
		TextObserver observer = new TextObserver(txtTemperature);
		WeatherForecast.getInstance().registerObserver(observer);
	}
}
