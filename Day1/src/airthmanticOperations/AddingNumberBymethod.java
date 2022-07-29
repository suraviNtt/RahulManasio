package airthmanticOperations;

public class AddingNumberBymethod {

	
	public void add(int x , int y) {
//		int i=x;
//		int j = y;
		int sum = x+y;
		System.out.println(sum);
	}
	
	public void sub(int x , int y) {
//		int i=x;
//		int j = y;
		int sum = x-y;
		System.out.println(sum);
	}
	
	public void mul(int x , int y) {
//		int i=x;
//		int j = y;
		int sum = x*y;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		AddingNumberBymethod obj = new AddingNumberBymethod();
		obj.add(10,20);
		obj.add(34, 56);
		obj.sub(100, 3);
		obj.mul(2, 15);
	}
}
