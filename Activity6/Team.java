class Team {
	private String name;
	private long numberOfMatches;
	public String getTeamName() {
		return name;
	}
	public void setTeamName(String name) {
		this.name = name;
	}
	public long getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(long numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public Team(String teamName, long numberOfMatches) {
		this.name = teamName;
		this.numberOfMatches = numberOfMatches;
	}
	@Override
	public String toString() {
		return "" + this.name + " - " + this.numberOfMatches;
	}
	

}