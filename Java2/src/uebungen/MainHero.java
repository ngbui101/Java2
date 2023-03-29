package uebungen;

public class MainHero {
	public static void main(String[] args) {
		Hero[] heros = HeroCreate.createHeros();
		Fiend[] fiends = SpawnEngine.spawn();
		Arena arena = new Arena(heros,fiends);
		for(Hero hero : arena.getHeros()) {
			System.out.printf("Heros name: %s%nHeros health: %d%n", hero.getName(), hero.getHealth());
		}
		//attack
		arena.getFiends()[1].attack(arena.getHeros()[0]);
		System.out.printf("Demon attackiert %s!!!%nNew %ss health is: %d%n",arena.getHeros()[0].getName(),arena.getHeros()[0].getName(),arena.getHeros()[0].getHealth());
	}
}
