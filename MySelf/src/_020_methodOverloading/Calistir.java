package _020_methodOverloading;

public class Calistir {

	public static void main(String[] args) {
		hesapla();
		hesapla("Merhaba");
		hesapla(new Integer(4));
		hesapla((Integer) null);
		hesapla((String) null);

	}

	static void hesapla() {
		System.out.println("Hesapla");
	}

	static void hesapla(String s) {
		System.out.println("Hesapla string : " + s);
	}

	static void hesapla(Integer i) {
		System.out.println("Hesapla string : " + i);
	}

}
