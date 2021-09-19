package design_patterns_softblue.Estrutura.Adapter;

// Adapter de objeto, nesse caso não temos herança
public class TemperatureObjectAdapter {

	private Temperature temperature;

	public TemperatureObjectAdapter(Temperature temperature) {
		this.temperature = temperature;
	}

	public double getValue() {
		return (temperature.getValue() - 32) * 5 / 9;
	}
	
	public void setValue(double value) {
		temperature.setValue(value * 9 / 5 + 32);
	}
}
