package silver_sol_1978;
//�Է¹��� �Ҽ��� ���� ã��
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int[] num = new int[tc];
		for (int i = 0; i < tc; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();

		int count=0;
		for(int i=0;i<tc;i++) {
			if(sosu(num[i])==true)
				count++;
		}
		System.out.println(count);
	}

	//�Լ� �̿�
	public static boolean sosu(int n) {

		int cnt = 0;
		for (int i = 1; i < n + 1; i++) {
			if (n % i == 0)
				cnt++;
		}
		if (cnt == 2)
			return true;
		else
			return false;
	}

}
