package conditionalOperations;

public class E {
	
	public static void main(String[] args) {
		
		int i =1 ;
		
		do {
			System.out.println(i); //1 //2 //3 //4
			i++; //2 //3 //4 //5
		}while(i<=4);
		System.out.println("End");
	}

}


/**
 * 
 * Factorisal of 5 using do while
 * 
 * 5*4*3*2*1 ; factorial of 4 = 4*3*2*1  ; factorial of 6  = 6*5*4*3*2*1
 * */
 
/*
 * 1
 * 1
 * 2
 * 3
 * 4
 * 5
 * 
 */