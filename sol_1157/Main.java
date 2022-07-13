package sol_1157;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int[] alphaArr=new int[26];
		
		for(int i=0; i<alphaArr.length;i++) {
			alphaArr[i]=0;
		} 		//0으로 초기화

		
		String st=sc.next();
		char[] charArr=st.toCharArray();
		for(int i=0;i<charArr.length;i++) {
			for(int j=65;j<91;j++) {//65~90이 대문자 A to Z ASCII 코드.
				if(charArr[i]==j||charArr[i]==j+22) alphaArr[j-65]+=1;
			}			
			
		}
		//여기까지 알파벳 배열에 숫자 넣기는 완료!
		//앞으로 할 것! 알파벳 배열에 어떤 숫자가 가장 큰지 구현하고, 가장 큰 숫자 겹칠 때는 물음표 구현하기~@!
		int max=alphaArr[0];//초기화
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
