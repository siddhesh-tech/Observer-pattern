import java.util.Observable;

public class Bar implements Observer {

	private GovernmentPolicy governmentPolicy = null;
	
	public Bar(GovernmentPolicy governmentPolicy) {
		this.governmentPolicy = governmentPolicy; 
	}
	
	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}
	
	
	public void unsubscribe() {
		governmentPolicy.removeObserver(this);
	}
	
}
