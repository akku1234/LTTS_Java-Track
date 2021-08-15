import java.util.Comparator;

class PlayerComparator implements Comparator<Player> {

	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		int nameCompare, skillCompare;
		skillCompare = o1.getSkill().compareTo(o2.getSkill());
		nameCompare = o1.getName().compareTo(o2.getName());
		
		return (skillCompare == 0)? nameCompare : skillCompare;
	}
	

}