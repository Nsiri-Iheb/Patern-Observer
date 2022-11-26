
public interface Observable {
	public void subscribe(Observer observer);//Add observer
	public void unsubscribe(Observer  observer);//Remove Observer
	public void notifyObservers();

}
