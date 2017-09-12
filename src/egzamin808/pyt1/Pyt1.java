package egzamin808.pyt1;

public class Pyt1 {
	
	public static void main(String[] args) {
        Test1 check1 = new Test1();
        Test1 check2 = new Test1();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count + ": " + check2.count);
    }

}
