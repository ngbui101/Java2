package uebungen;

public class Arena {
	protected Hero[] heros;
	protected Fiend[] fiends;
	public Arena(Hero[] heros, Fiend[] fiends) {
		this.heros = heros;
		this.fiends = fiends;
	}

	public Hero[] getHeros() {
		return heros;
	}
	public void setHeros(Hero[] heros) {
		this.heros = heros;
	}

	public Fiend[] getFiends() {
		return fiends;
	}

	public void setFiends(Fiend[] fiends) {
		this.fiends = fiends;
	}
	
	
}
