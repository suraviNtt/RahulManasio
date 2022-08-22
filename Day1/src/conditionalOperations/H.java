package conditionalOperations;

public class H {

	public static void main(String[] args) {
		
		int i = 1;
		
		i++ ; //1
		System.out.println(i); //2
		i--;//2
		System.out.println(i); //1
		++i;//2
		System.out.println(i);//2
		--i;//1
		System.out.println(i);//1
		
		
		int y = i++ + i-- +i++ + i++;
		//i -- 1+2+1+2
		//sum -- 1 , 3 , 4,  6
		System.out.println(y);
		
		int x = y++ + ++y + y;
		//y 6+8+8
		//sum 6
		System.out.println(x);
		
		int n = i++ + ++i + --i +i++ ;
		//i  1+2+1+2+3
		//i  3+5+4+4
		System.out.println(i);
		System.out.println(n);
	}
}
