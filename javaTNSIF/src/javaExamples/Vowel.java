package javaExamples;

public class Vowel {

	public static void main(String[] args) {
		String s = "great job";
		int [] count=new int[5];
		int vowel=0;
		
		for (int i = 0; i < s.length(); i++) { 
            if(s.charAt(i)=='a' || s.charAt(i)=='A') { 
               count[0]++; }
            else if(s.charAt(i)=='e' || s.charAt(i)=='E'){
            	 count[1]++;
            }
            else if(s.charAt(i)=='i' || s.charAt(i)=='I') {
            	 count[2]++;
            }
            else if(s.charAt(i)=='o' || s.charAt(i)=='O') {
            	 count[3]++;
            }
            else if(s.charAt(i)=='u' || s.charAt(i)=='U') {
            	 count[4]++;
            }
		}
  
		System.out.println("Count of 'a' = " + count[0]);
        System.out.println("Count of 'e' = " + count[1]);
        System.out.println("Count of 'i' = " + count[2]);
        System.out.println("Count of 'o' = " + count[3]);
        System.out.println("Count of 'u' = " + count[4]);
		

	}

}
