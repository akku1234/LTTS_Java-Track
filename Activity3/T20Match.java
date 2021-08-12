
public class T20Match extends Match {

	public T20Match(int currentscore, int currentover, int target) {
		super(currentscore, currentover, target);
	}

	float calculateRunRate() {
		return (getTarget() - getCurrentscore())/(20- getCurrentover());
	}
	
	int calculateBalls() {
		return (20 - getCurrentover())*6;
	}
	
	void display() {
		int runs = getTarget() - getCurrentscore();
		System.out.println("Need "+runs+" runs in "+calculateBalls()+" balls");
		System.out.println("Required Runrate: "+calculateRunRate());
	}
}