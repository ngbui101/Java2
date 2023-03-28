package uebungen;

public class SpawnHero {
	public Hero spawn(String heroName, int health) {
		if(heroName.equals("Mage"))
			return new Mage(health);
		else if(heroName.equals("Paladin"))
			return new Paladin(health);
		else if(heroName.equals("Knight"))
			return new Knight(health);
		else {
			System.err.println("kein korrekte Hero gegeben");
			return null;
		}
	}
}
