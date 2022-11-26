import java.util.ArrayList;
import java.util.List;

public class ObservableImplementation  implements Observable{
	private int state=20;
	private List<Observer> observers=new ArrayList<Observer>();

	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer observer:observers) {
			observer.Update(this);
		}
		
		
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		this.notify();
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

}
