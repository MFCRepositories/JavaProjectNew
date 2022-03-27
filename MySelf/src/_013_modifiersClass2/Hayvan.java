package _013_modifiersClass2;

public class Hayvan extends Canli {

	private int yas = 7;

	public int getYas() {

		System.out.println("Hayvan classındaki getYas() çalıstı");

		return yas;

	}

	public void setYas(int yas) {
		this.yas = yas;
	}
}
