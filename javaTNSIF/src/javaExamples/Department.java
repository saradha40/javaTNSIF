package javaExamples;

public class Department {

	public static void main(String[] args) {
		char branch='e';
		int collageyear=2;
		switch(collageyear) {
		case 1:
				System.out.println("python");
				System.out.println("maths");
				System.out.println("evs");
				System.out.println("eg");
		        break;
		case 2:
			System.out.println("2nd year");
		   switch(branch) {
		case 'm':
				System.out.println("mechanical");
				System.out.println("machine");
				System.out.println("tools");
				System.out.println("motor");
				break;
		case 'e':
				System.out.println("ece");
				System.out.println("cricuit");
				System.out.println("current");
				System.out.println("area");
				break;
		case 'c':
				System.out.println("cse");
				System.out.println("ds");
				System.out.println("dsdp");
				System.out.println("oop");
				break;
			}
		   break;
		case 3:
			System.out.println("3rd year");
			switch(branch) {
		case 'm':
				System.out.println("mechanical");
				System.out.println("light");
				System.out.println("current");
				break;
		case 'e':
				System.out.println("ece");
				System.out.println("mcmp");
				System.out.println("lic");
				break;
		case 'c':
				System.out.println("cse");
				System.out.println("toc");
				System.out.println("ooad");
				break;
			}
		break;
		case 4:
			System.out.println("4th year");
			switch(branch)
			{
		case 'm':
			System.out.println("mechanical");
			System.out.println("motor cycle");
			System.out.println("bike");
			break;
		case 'e':
			System.out.println("ece");
			System.out.println("table");
			System.out.println("light");
			break;
		case 'c':
			System.out.println("cse");
			System.out.println("os");
			System.out.println("ip");
			System.out.println("dp");
			break;
			
		default:
			System.out.println("invaild data");
		}
			}
			}
		
}




