package basicCode;
import java.util.*;

public class reverseNumberJavaCode {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to be reverse");	
		int num=sc.nextInt();
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;
		}
		System.out.println("Reverse Number is "+rev);
		
	}

}
