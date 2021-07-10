/*package day03;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();//트럭개수
		int w=scan.nextInt();//다리길이
		int l=scan.nextInt();//최대하중
		int time=1;
		int[] truck= new int[n];
		int[] bridge=new int[w];
		for(int i=0;i<n;i++) {
			truck[i]=scan.nextInt();
		}
		//한대가 완벽히 건너는 시간은 w+1
		//다리에 한번에 올라갈 수 있는 트럭 개수는 w개
		bridge[0]=truck[0];
		truck[0]=0;
		int k=1;
		for(int i=0;i<n*w;i++) {
			//다리 위 하중 구하기
			int sum=0;
			for(int j=0;j<w;j++) {
				sum+=bridge[j];
			}
			int tsum=0;
			for(int j=0;j<n;j++) {
				tsum+=truck[j];
			}
			//트럭이 모두 이동했을 때
			if(tsum==0&&sum==0) {
				break;
			}
			
			if((k<=n-1)&&(sum-bridge[w-1]+truck[k]<=l)) {//트럭 들어오고 이동
				System.out.println("트럭들어옴");
				for(int a=w-2;a>=0;a--) {
					bridge[a+1]=bridge[a];
					bridge[a]=0;
				}
				bridge[0]=truck[k];
				truck[k]=0;
				k++;
			}
			else {//그냥 이동
				for(int a=w-2;a>=0;a--) {
					bridge[a+1]=bridge[a];
					bridge[a]=0;
				}
			}
			time++;
		}
		System.out.println(time);
	}

}*/
