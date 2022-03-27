package _019_classOrnekleri4;

public class Canli {
	static {
		System.out.println("Canli static blogu calisti");

	}

	public Canli() {
		this(4);
		System.out.println("Canli default constructor calisti");
	}

	public Canli(int a) {
		System.out.println("Canli parametreli constructor calisti");
		System.out.println(5);
		System.out.println(a);
	}

}
