import java.util.Scanner;

//3052-���δٸ� �������� ����
public class Main {

	public static void main(String[] args) {		
		int[] inputnum=new int[10];
		int[] remainder=new int[42];
		int count=0;		
		Scanner sc=new Scanner(System.in);
		
		//������ �迭 remainder 0~42���� ��� 0���� �ʱ�ȭ
		for(int i=0;i<42;i++) {
			remainder[i]=0;
		}
		
		//input�� 10�� �ޱ� //������ ���ϱ�
		for(int i=0;i<10;i++) {
			inputnum[i]=sc.nextInt();
			inputnum[i]=inputnum[i]%42;
		}
		sc.close();
		
		
		//�������� �ε����� �Է°��� ���ؼ� ������ ������ �迭data+1
		for(int i=0;i<10;i++) {
			for(int j=0;j<42;j++) {
				if(inputnum[i]==j) remainder[j]++;
			}
		}
		
		//������ �迭 0�� �ƴѿ�ҵ�(0�� �ƴ϶�� ���� �������� �����ߴٴ� �ǹ�)�� �� count+1
		for(int i=0;i<42;i++) {
			if(remainder[i]!=0)
				count++;
		}
		System.out.println(count);

	}

}
