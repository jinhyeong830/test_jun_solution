import java.util.ArrayList;
import java.util.Scanner;

//3052-���δٸ� �������� ����
public class Main {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		//ox ���� String �� ����
		String store_ox=null;
		
		//ox��ŭ ������(���� ������) �� �ε����� ������ ���� integer�� ����
		ArrayList <Integer> score=new ArrayList<Integer>();
		
		//tc�ޱ�
		int tc=sc.nextInt();
		for(int i=0; i<tc;i++) {
			store_ox=sc.next();
			//string to char array
			char[] arr=store_ox.toCharArray();
			
			
			//logic start :arr[0] �� ����
			if(arr[0]=='O')
				score.add(1);
			else if(arr[0]=='X')
				score.add(0);
			
			//4���� ��� ox oo xx xo�� ������ �����迭�� �� ���� �ֱ�
			for(int j=1;j<arr.length;j++) {
				if(arr[j]=='O')
					score.add((score.get(j-1))+1);
				else if(arr[j]=='X')
					score.add(0);
			}
			
			int sum=0;
			for(int j=0;j<score.size();j++) {
				sum+=score.get(j);
			}
			System.out.println(sum);
			score.clear();
		}
		sc.close();

	}

}
