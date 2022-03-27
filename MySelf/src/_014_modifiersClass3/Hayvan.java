package _014_modifiersClass3;

public class Hayvan extends Canli {

	private int yas = 45;

	public int getYas() {

		System.out.println("Hayvan classındaki getYas() çalıstı");

		return yas;

	}

	public void setYas(int yas) {
		this.yas = yas;
	}
}
