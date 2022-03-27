package _012_modifiers;

public class Hayvan extends Canli {

	int yas = 7;

	public int getYas() {

//		return super.yas;
		return super.getYas();
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
}
