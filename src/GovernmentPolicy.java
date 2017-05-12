
public interface GovernmentPolicy {
	
	public void addObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObserver();
}
