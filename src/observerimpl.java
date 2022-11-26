
public class observerimpl  implements Observer{
	//private Observable observable;

	@Override
	public void Update(Observable observable) {
		int state=((ObservableImplementation)observable).getState();
			System.out.println("state is"+state);
	}

}
