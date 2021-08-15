class Player {
	private String name, skill;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public Player(String name, String skill) {
		this.name = name;
		this.skill = skill;
	}

	public String toString() {
		return "Player : " + this.name + " Skill : " + this.skill ;
	}
	
	

}