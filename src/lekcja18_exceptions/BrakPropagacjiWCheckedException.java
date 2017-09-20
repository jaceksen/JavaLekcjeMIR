package lekcja18_exceptions;

public class BrakPropagacjiWCheckedException {
	
	
	void m(){  
	    throw new java.io.IOException("device error");//checked exception  
	  }  
	
	  void n(){  
	    m();  
	  }  
	  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handeled");}  
	  }  
	  
	  public static void main(String[] args) {
		
		  BrakPropagacjiWCheckedException b1 = new BrakPropagacjiWCheckedException();
		  
		  b1.p();
		  
		  System.out.println("Tralalala");
		  
	}


}
