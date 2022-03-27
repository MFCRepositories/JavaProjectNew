package _021_wrapperClasslar;

public class Calistir {

	public static void main(String[] args) {

		int sayi = 5;

		// Primitive den Wrapper a dönüþüm
		Integer wrapperSayi = Integer.valueOf(sayi);
		System.out.println("wrapperSayi : " + wrapperSayi);
//		wrapperSayi = null;
		// wrapperSayi = "ali";
		System.out.println("wrapperSayi : " + wrapperSayi);

		// Primitive den String e dönüþüm
		String stringSayi = String.valueOf(sayi);
		System.out.println("stringSayi : " + stringSayi);
		stringSayi = "ali";
		System.out.println("stringSayi : " + stringSayi);

		// Wrapper den String e dönüþüm

		stringSayi = wrapperSayi.toString();
		stringSayi = "mahmut";
		System.out.println("Stringsayi : " + stringSayi);

		// Wrapper den Primitive e dönüþüm

		sayi = wrapperSayi.intValue();
		System.out.println("Primitive : " + sayi);

		// String den primitive
		String no = "13";
		int d;
		d = Integer.parseInt(no);
//		k = Integer.valueOf(no);
		System.out.println("No : " + d);

	}

}
