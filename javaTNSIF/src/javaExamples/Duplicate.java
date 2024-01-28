package javaExamples;

public class Duplicate extends Thread {
	public void run() {
		try {
		int a[]=new int[] {1,2,3,4,4,7,8,7,3};
		for(int i=0;i<a.length;i++)
		{
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j])
				System.out.println(a[j]);
		}}}
		catch(Exception e) {
			
		}
			
		}
		
		

	}


