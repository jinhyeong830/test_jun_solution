package sol_11720;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// ������ ����,,�迭�� length,
		String s=sc.next();
		
		//char �� �Է¹ްų�... string �� �����ϰų�!?
		
		int sum = 0;
		for (int j = 0; j <n; j++) {
			sum += s.charAt(j) - '0';// need char to integer
		}
		System.out.println(sum);

		sc.close();

	}

}
