package javaExamples;
class toys{
	void toy() {
		System.out.println("there are many kind of toys");
	}
}
class dragontoy extends toys{
	void dt() {
		System.out.println("dragon");
	}
}
class snaketoy extends toys{
	void st() {
		System.out.println("snake");
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dragontoy d=new dragontoy();
		d.dt();
		d.toy();
		snaketoy s=new snaketoy();
		s.st();
		s.toy();

	}

}
