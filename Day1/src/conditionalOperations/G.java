package conditionalOperations;

public class G {

	
	public static void main(String[] args) {
		
		int i =0;
		if(i<0) {
			System.out.println("True");
		}else if(i == 0) {
			System.out.println("Equal");
		}else if(i>0) {
			System.out.println("Correct");
		}else if(i>2) {
			System.out.println("uh");
		}else {
			System.out.println("wrong");
		}
	}
}
