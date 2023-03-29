package uebungen;


public class Die {
	protected static int sides;

//	public Die(int sides) {
//		this.sides = sides;
//	}
	public static int throwDie() {
		return (int)(Math.random()*30+1);
	}
	
}
