package _018_classOzellikleri3;

import java.util.Scanner;

public class Calistir {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Bitki bitki = new Bitki(100);
		System.out.println("Bitkinin ilk degeri : " + bitki.getYas());
		System.out.println("Bitkiye yeni deger giriniz : ");
		var deger = scn.nextInt();
		bitki.setYas(deger);
		System.out.print(bitki.getYas());
		scn.close();

	}

}
