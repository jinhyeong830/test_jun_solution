package sol_15596;
//�Լ� �����ؼ� ���� ���� Ǯ��: n���� ��
public class Main {
	public long sum(int[] a) {
		//a�� ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 a[]
		long sum=0;
		for(int i=0; i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
}
