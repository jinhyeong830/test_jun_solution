package sol_1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		
		String[] s1= s.split(" "); 
		for(int i=0; i<s1.length;i++) {
			System.out.println(s1[i]);
		}


//		int n=s1.length;
//		System.out.println(n);

	}

}
