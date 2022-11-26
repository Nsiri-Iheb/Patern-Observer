
public class Test {

	public static void main(String[] args) {
		Observer observer=new observerimpl();
		Observer observer2=new observerimpl2();
		Observable  observable=new ObservableImplementation();
		observable.subscribe(observer2);
		observable.subscribe(observer);
	((ObservableImplementation)observer).setState(8);
	((ObservableImplementation)observer).setState(18);
	((ObservableImplementation)observer).setState(8);
		
	
		
			
		};

	}


