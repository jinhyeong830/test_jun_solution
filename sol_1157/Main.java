package sol_1157;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int[] alphaArr=new int[26];
		
		for(int i=0; i<alphaArr.length;i++) {
			alphaArr[i]=0;
		} 		//0���� �ʱ�ȭ

		
		String st=sc.next();
		char[] charArr=st.toCharArray();
		for(int i=0;i<charArr.length;i++) {
			for(int j=65;j<91;j++) {//65~90�� �빮�� A to Z ASCII �ڵ�.
				if(charArr[i]==j||charArr[i]==j+22) alphaArr[j-65]+=1;
			}			
			
		}
		//������� ���ĺ� �迭�� ���� �ֱ�� �Ϸ�!
		//������ �� ��! ���ĺ� �迭�� � ���ڰ� ���� ū�� �����ϰ�, ���� ū ���� ��ĥ ���� ����ǥ �����ϱ�~@!
		int max=alphaArr[0];//�ʱ�ȭ
		int tmp=0;
		for(int i=0; i< alphaArr.length-1;i++) {
			if(alphaArr[i]<alphaArr[i+1]) {
				max=alphaArr[i+1];
				tmp=i+1;
			}
		}
		System.out.println(alphaArr[tmp]);
			
	}

}
