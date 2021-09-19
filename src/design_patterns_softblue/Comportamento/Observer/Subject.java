package design_patterns_softblue.Comportamento.Observer;

public interface Subject {

	public void registerObserver(Observer observer);
	public void unregisterObserver(Observer observer);
	public void notifyObservers();
}
