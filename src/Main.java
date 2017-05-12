
public class Main {
	public static void main(String[] args) {
		BJPPolicy bjpPolicy = new BJPPolicy();
		CongressPolicy congressPolicy = new CongressPolicy();
		
		Bar bar = new Bar(bjpPolicy);
		Hotel hotel = new Hotel(bjpPolicy);
		
		bjpPolicy.addObserver(bar);
		bjpPolicy.addObserver(hotel);
		
		congressPolicy.addObserver(bar);
		congressPolicy.addObserver(hotel);
		
		bjpPolicy.setPolicy_implemented(true);
		congressPolicy.setPolicy_implemented(true);
	}
}
