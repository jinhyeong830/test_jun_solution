package silver_sol_4673;
//�����ѹ�
public class Main {
	public static int d(int num) {
		int sum=num;
		while(num!=0) {
			sum=sum+(num%10);
			num/=10;
		}
		return sum;
	}//d();�Լ� ����
	public static void main(String[] args) {
		boolean[] numCheck=new boolean[10001];
		//�����ڰ� ������ numcheck�迭�� true��.
		for(int i=0; i<10001; i++) {
			int n=d(i);
			if(n<10001)
				numCheck[n]=true;
		}
		for(int i=0;i<10001;i++) {
			if(numCheck[i]==false) {
				System.out.println(i);
			}
		}

	}

}
