package _019_classOrnekleri4;

public class Bitki extends Canli {
	static {
		System.out.println("SubClass static blogu calisti");

	}

	public Bitki(int a) {
		this();

		System.out.println("Bitki parametreli constructor calisti");
		System.out.println(a);

	}

	public Bitki() {
		super();
		System.out.println("Bitki default constructor calisti");

	}

}
