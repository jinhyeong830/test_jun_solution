package sol_1157;

//������ ���� �װ���!! �ٸ� ��� �ڵ嵵 ���� �� �ϱ�
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		sc.close();
		//���ĺ� �� �� ������ ���� �迭����&�ʱ�ȭ
		int[] alphaArr = new int[26];
		for (int i = 0; i < alphaArr.length; i++) {
			alphaArr[i] = 0;
		}
		
		//�Է� ���� ���ڿ� char�� �迭����
		char[] charArr = st.toCharArray();
		
		// 65~90�� �빮�� A to Z ASCII �ڵ�.97���Ͱ� �ҹ���!
		//�Է� ���ڿ� ó������ ������ �˻�(i) �Է� ���ڿ�[i]�� a�ų� A�� ��~z�ų�Z�� �� ���Ĺ迭�� �� ���ĺ��� �ε����� �ش��ϴ� �� +1 ���ֱ� 
		for (int i = 0; i < charArr.length; i++) {
			for (int j = 65; j < 91; j++) {
				if (charArr[i] == j || charArr[i] == j + 32)
					alphaArr[j - 65] += 1;
			}
		}
		//tmp max�� �ִ밪�� �ε�����ȣ, �ִ� �����ϴ� ���� �ƽ��� �����ؾ� ���� �� �̾�
		int tmp = 0;
		int max = alphaArr[0];
		for (int i = 0; i < alphaArr.length - 1; i++) {
			if (max < alphaArr[i + 1]) { //�ִ񰪰� �ִ񰪿� �ش��ϴ��ε��� �ѹ� ���ϱ�
				max = alphaArr[i + 1];
				tmp = i + 1;
			}
		}
		char c = (char) (tmp + 65); //���ϸ��� ���� ���ĺ��� �ε���+65(�빮�ڷ� ��ȯ�ϱ� ����)
		
		//�ִ��� ��ġ��(2�� �̻��̸�) ����ǥ ����ϱ� ���� ����
		int cnt = 0;
		for (int i = 0; i < alphaArr.length; i++) {
			if (max == alphaArr[i])
				cnt++;
		}
		if (cnt == 1)
			System.out.println(c);
		else
			System.out.println("?");
	}

}
