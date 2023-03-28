package uebungen;

public abstract class Hero {
	protected int health;
	protected String name;
	public Hero(int health, String name) {
		this.health = health;
		this.name = name;
	}
	public abstract void attack(Fiend fiend);
}
