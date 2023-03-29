package uebungen;

public class SpawnEngine {
	public static Fiend[] spawn() {
		Fiend[] fiend = new Fiend[3];
		fiend[0] = new Golem();
		fiend[1] = new Demon();
		fiend[2] = new Spider();
		return fiend;
	}
}
