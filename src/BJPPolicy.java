import java.util.ArrayList;

public class BJPPolicy implements GovernmentPolicy {
	
	private boolean policy_implemented = false;
	private ArrayList<Observer> policyObservers = new ArrayList<Observer>();
	private String message = "Bars Closed. \nHotels Open.";
	
	public boolean isPolicy_implemented() {
		return policy_implemented;
	}

	public void setPolicy_implemented(boolean policy_implemented) {
		this.policy_implemented = policy_implemented;
		notifyObserver();
	}

	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		policyObservers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		policyObservers.remove(o);
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		System.out.println("------------ BJP Government Policy ------------");
		for(Observer po: policyObservers) {
			po.update(message);
		}
		System.out.println("-----------------------------------------------------");
	}
	
	
}
