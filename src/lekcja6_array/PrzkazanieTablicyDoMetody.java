package lekcja6_array;

public class PrzkazanieTablicyDoMetody {

	public static void main(String[] args) {
		
		int c[] = {1,2,3,4,5,6,7,8,9,10};
		int d[] = {100,200,300};
		
		new OdebranieTablicy().getOdebranieTablicy().odczytTablicy(c);
		
		new OdebranieTablicy().getOdebranieTablicy().odczytTablicy(d);
		
		OdebranieTablicy odbiernie = new OdebranieTablicy();
		odbiernie.odczytTablicy(c);
		

	}

}
