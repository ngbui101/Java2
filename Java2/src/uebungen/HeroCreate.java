package uebungen;

public class HeroCreate {
	public static Hero[] createHeros() {
		Hero[] hero= new Hero[3];
		hero[0] = new Knight(50);
		hero[1] = new Paladin(35);
		hero[2] = new Mage(20);
		return hero;	
	}
	public static int generateHealth() {
		return (int) (Math.random()*50 + 10);
	}
}
