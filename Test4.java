/*package day03;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();//Ʈ������
		int w=scan.nextInt();//�ٸ�����
		int l=scan.nextInt();//�ִ�����
		int time=1;
		int[] truck= new int[n];
		int[] bridge=new int[w];
		for(int i=0;i<n;i++) {
			truck[i]=scan.nextInt();
		}
		//�Ѵ밡 �Ϻ��� �ǳʴ� �ð��� w+1
		//�ٸ��� �ѹ��� �ö� �� �ִ� Ʈ�� ������ w��
		bridge[0]=truck[0];
		truck[0]=0;
		int k=1;
		for(int i=0;i<n*w;i++) {
			//�ٸ� �� ���� ���ϱ�
			int sum=0;
			for(int j=0;j<w;j++) {
				sum+=bridge[j];
			}
			int tsum=0;
			for(int j=0;j<n;j++) {
				tsum+=truck[j];
			}
			//Ʈ���� ��� �̵����� ��
			if(tsum==0&&sum==0) {
				break;
			}
			
			if((k<=n-1)&&(sum-bridge[w-1]+truck[k]<=l)) {//Ʈ�� ������ �̵�
				System.out.println("Ʈ������");
				for(int a=w-2;a>=0;a--) {
					bridge[a+1]=bridge[a];
					bridge[a]=0;
				}
				bridge[0]=truck[k];
				truck[k]=0;
				k++;
			}
			else {//�׳� �̵�
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
