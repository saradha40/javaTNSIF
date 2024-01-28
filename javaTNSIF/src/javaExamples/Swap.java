package javaExamples;
import java.util.*;



public class Swap {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value of x and y");
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping:"+x+" "+y);
		
		}
	}


