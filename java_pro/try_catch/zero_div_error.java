package try_catch;


import java.util.Scanner;
import java.io.*;

public class zero_div_error {
	public int a,b;
	public int result;
	
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			int result=a/b;
			System.out.println("result is: "+result);
			
		}catch(Exception e) {
			System.out.println("error: "+e.getMessage());
		}
	}

}
