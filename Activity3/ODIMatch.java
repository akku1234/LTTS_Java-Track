
public class ODIMatch extends Match {

	public ODIMatch(int currentscore, int currentover, int target) {
		super(currentscore, currentover, target);
	}

	float calculateRunRate() {
		return (getTarget() - getCurrentscore())/(50- getCurrentover());
	}
	
	int calculateBalls() {
		return (50 - getCurrentover())*6;
	}
	
	void display() {
		int runs = getTarget() - getCurrentscore();
		System.out.println("Need "+runs+" runs in "+calculateBalls()+" balls");
		System.out.println("Required Runrate: "+calculateRunRate());
	}
}