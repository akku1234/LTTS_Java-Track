public class TestMatch extends Match {

	public TestMatch(int currentscore, int currentover, int target) {
		super(currentscore, currentover, target);
	}

	float calculateRunRate() {
		return (getTarget() - getCurrentscore())/(90- getCurrentover());
	}
	
	int calculateBalls() {
		return (90 - getCurrentover())*6;
	}
	
	void display() {
		int runs = getTarget() - getCurrentscore();
		System.out.println("Need "+runs+" runs in "+calculateBalls()+" balls");
		System.out.println("Required Runrate: "+calculateRunRate());
	}
}