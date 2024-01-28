package javaExamples;
class a{
	void showa() {
		System.out.println("this is A");
	}
}
class b extends a{
	void showb() {
		System.out.println("this is B");
	}
}
class c extends b{
	
	void showc() {
		System.out.println("this is C");
	}
}
class d extends b{
	void showd() {
		System.out.println("this is D");
	}
}

public class Hybrid {
	public static void main(String[]args) {
		 c out=new c();
		 out.showa();
		 out.showb();
		 out.showc();
		 d in=new d();
		 in.showa();
		 in.showb();
		 in.showd();
		
	}

}
