
public class observerimpl2  implements Observer{
	//private Observable observable;

	@Override
	public void Update(Observable observable) {
		int state=((ObservableImplementation)observable).getState();
			System.out.println("state is"+state);
	}

}
