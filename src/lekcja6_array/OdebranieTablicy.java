package lekcja6_array;

public class OdebranieTablicy {
	
	public OdebranieTablicy getOdebranieTablicy() {
		return this;
	}
	
	public void odczytTablicy(int a[]) {
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Element: " + i + " o wartości: " + a[i]);
		}
	}

}
