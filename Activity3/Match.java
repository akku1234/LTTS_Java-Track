
public abstract class Match {

	private int currentscore;
	private int currentover;
	private int target;
	
	public int getCurrentscore() {
		return currentscore;
	}
	public void setCurrentscore(int currentscore) {
		this.currentscore = currentscore;
	}
	public int getCurrentover() {
		return currentover;
	}
	public void setCurrentover(int currentover) {
		this.currentover = currentover;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	public Match(int currentscore, int currentover, int target) {
		super();
		this.currentscore = currentscore;
		this.currentover = currentover;
		this.target = target;
	}
	
	abstract float calculateRunRate();
	abstract int calculateBalls();
	abstract void display();
}