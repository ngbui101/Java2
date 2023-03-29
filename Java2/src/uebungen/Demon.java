package uebungen;

public class Demon extends Fiend{

	public Demon() {
		super();
	}

	@Override
	public void attack(Hero hero) {
		hero.setHealth(hero.getHealth() - Die.throwDie());
	}
	
	
}
