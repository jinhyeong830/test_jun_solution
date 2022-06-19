import java.util.Scanner;

//3052-서로다른 나머지의 갯수
public class Main {

	public static void main(String[] args) {		
		int[] inputnum=new int[10];
		int[] remainder=new int[42];
		int count=0;		
		Scanner sc=new Scanner(System.in);
		
		//나머지 배열 remainder 0~42까지 모두 0으로 초기화
		for(int i=0;i<42;i++) {
			remainder[i]=0;
		}
		
		//input값 10개 받기 //나머지 구하기
		for(int i=0;i<10;i++) {
			inputnum[i]=sc.nextInt();
			inputnum[i]=inputnum[i]%42;
		}
		sc.close();
		
		
		//나머지의 인덱스와 입력값과 비교해서 같으면 나머지 배열data+1
		for(int i=0;i<10;i++) {
			for(int j=0;j<42;j++) {
				if(inputnum[i]==j) remainder[j]++;
			}
		}
		
		//나머지 배열 0이 아닌요소들(0이 아니라는 것은 나머지로 등장했다는 의미)일 때 count+1
		for(int i=0;i<42;i++) {
			if(remainder[i]!=0)
				count++;
		}
		System.out.println(count);

	}

}
