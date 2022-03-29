package _026_arrays;

public class Diziler {
	public static void main(String[] args) {
		int[] dizi = new int[3];
		dizi[0] = 1;
		dizi[1] = Integer.parseInt("5");

		for (int i = 0; i < dizi.length; i++) {
			System.out.println("Dizi[" + i + "] : " + dizi[i]);
		}
		System.out.println("-----------------");
		int[] dizi1 = { 1, 2, 5 };
		for (int i = 0; i < dizi1.length; i++) {
			System.out.println("Dizi[" + i + "] : " + dizi1[i]);
		}
		System.out.println("-----------------");
		int[] dizi2 = { 12, 5, 2, 5, 9 };
		for (int i = 0; i < dizi2.length; i++) {
			System.out.println("Dizi[" + i + "] : " + dizi2[i]);
		}
	}

}
