package sol_4344;

import java.util.Scanner;
  
//����� �Ѱ���?
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		for(int i=0;i<c;i++) {
			int n=sc.nextInt();
			int[] score=new int[n+1];
			double sum=0;
			double avg=0;
			double cnt=0;
			for(int j=0;j<n;j++) {
				score[j]=sc.nextInt();
				sum=sum+score[j];
				avg=sum/n;
			}
			//avg Ȯ���ǰ� ���ؾ� �ϱ⶧���� for�� ���ν��ֱ�
			for(int j=0;j<n;j++) {
				if(avg<score[j]) cnt++;	
			}
			n=Math.round(n);
			double per=(cnt*100)/n;
			
			System.out.println(String.format("%.3f", per)+"%");
			//����� �Ѵ� ����?
			
		}
		sc.close();

	}

}
