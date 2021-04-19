package week8;

import java.util.Scanner;

class AddZeroException extends Exception{}

class SubtractZeroException extends Exception{}

class OutOfRangeException extends Exception{}

public class SimpleCalculator {
	public static void add(int a, int b) throws AddZeroException,OutOfRangeException{
		if(a==0||b==0) {
			throw new AddZeroException();
		}
		if(a<0||a>1000||b<0||b>1000||a+b>1000) {
			throw new OutOfRangeException();
		}
		System.out.println(a+b);
	}
	
	public static void subtract(int a, int b) throws SubtractZeroException,OutOfRangeException{
		if(a==0||b==0) {
			throw new SubtractZeroException();
		}
		if(a<0||a>1000||b<0||b>1000||a-b<0) {
			throw new OutOfRangeException();
		}
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int n=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='+'||s.charAt(i)=='-') {
				n=i;
			}
		}
		int a=Integer.parseInt(s.substring(0, n));
		int b=Integer.parseInt(s.substring(n+1, s.length()));
		char c=s.charAt(n);
		try {
			if(c=='+') {
				add(a,b);
			}
			else if(c=='-') {
				subtract(a,b);
			}
		}catch(AddZeroException e) {
			System.out.println("AddZeroException");
		}catch(SubtractZeroException e){
			System.out.println("SubtractZeroException");
		}catch(OutOfRangeException e) {
			System.out.println("OutOfRangeException");
		}
	}
}

