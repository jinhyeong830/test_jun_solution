package sol_10809;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		sc.close();
		for(char c='a';c<='z';c++) {	
			System.out.print(s.indexOf(c)+" ");
		}
		
		//char �� for������ ���ư��ϴ�
		//indexOf() �� ���ڿ��� ���ڰ� ó������ ������ ��ġ�� ��ȯ�ϴ� �޼ҵ��Դϴ�.
	}

}
