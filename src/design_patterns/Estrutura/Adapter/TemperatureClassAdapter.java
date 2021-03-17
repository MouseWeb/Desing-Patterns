package design_patterns.Estrutura.Adapter;

// Adapter do tipo de Class extend a class q está adaptando
public class TemperatureClassAdapter extends Temperature {

	@Override
	public void setValue(double value) {
		super.setValue(value * 9 / 5 + 32);
	}
	
	@Override
	public double getValue() {
		return (super.getValue() - 32) * 5 / 9;
	}

	// Pode-se adicionar outros comportamentos dentro do adapter
	// método retorna os grau fahrenheit correspondente a valor da passagem de param
	public double getValueInFahrenheit() {
		return super.getValue();
	}
}
