package lekcja12_final;

public class Wigry extends Rower{
	
	static final int rok;
	
	//jedyny sposób nadawania warości
	//zmiennej stic final 
	static {
		rok = 3333;
	}
	
	public Wigry() {
	}
	
	int kwadrat(final int x) {
		return x*x;
	}
	

	public static void main(String[] args) {
		
		Wigry wigry = new Wigry();
		
		wigry.wypisz();
		
		System.out.println(wigry.kwadrat(7));

	}

}
