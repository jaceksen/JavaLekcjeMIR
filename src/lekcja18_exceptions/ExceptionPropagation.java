package lekcja18_exceptions;

public class ExceptionPropagation {
	
	void m(){  
	    int data=50/0;  
	  }  
	
	  void n(){  
	    m();  
	  } 
	  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handled");}  
	  }  

	public static void main(String[] args) {
		
		ExceptionPropagation e1 = new ExceptionPropagation();
		e1.p();
		
		System.out.println("Tralalala");

	}

}
