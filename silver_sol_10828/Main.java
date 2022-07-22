package silver_sol_10828;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int orderNum = sc.nextInt(); // ����� ��
		ArrayList<Integer> arrList = new ArrayList<Integer>();

		for(int i=0; i<orderNum;i++) {
			String function = sc.next();
			// push���� �� ����ϴ� ���
			if (function.equals("push")) {
				int x = sc.nextInt();
				arrList.add(x);
			} else if (function.equals("pop")) {
				if (arrList.size() == 0)
					System.out.println(-1);
				else
					System.out.println(arrList.remove(arrList.size() - 1)); // arrlist�� ������ ������ ����, ���� �޼ҵ尡 remove�� �³�?
			} else if (function.equals("size")) {
				System.out.println(arrList.size());
			} else if (function.equals("empty")) {
				if (arrList.size() == 0)
					System.out.println(1);
				else
					System.out.println(0);
			} else if (function.equals("top")) {
				if(arrList.size()==0)
					System.out.println(-1);
				else
					System.out.println(arrList.get(arrList.size()-1));
			}

		}
		sc.close();
	}

}
