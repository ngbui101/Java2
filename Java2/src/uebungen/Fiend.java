package uebungen;

public abstract class Fiend {
	protected int health;
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public abstract void attack(Hero hero);
}
