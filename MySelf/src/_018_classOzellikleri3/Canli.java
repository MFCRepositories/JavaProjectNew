package _018_classOzellikleri3;

public class Canli {

	private int yas;

	public void setYas(int yas) {

		this.yas = yas;
		System.out.println("Canli Setyas : " + this.yas);
	}

	public int getYas() {
		System.out.println("Canli Getyas :" + this.yas);
		return yas;
	}

	public Canli(int yas) {
		this.yas = yas;
		System.out.println("Canli Constructor :" + this.yas);
	}

}
