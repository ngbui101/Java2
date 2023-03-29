package uebungen;

public abstract class Hero {
	protected int health;
	protected String name;
	public Hero(int health, String name) {
		this.health = health;
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health < 0) {
			System.out.println("Health must be more than zero");
			this.health = 0;
			return;
		}
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void attack(Fiend fiend);
}
