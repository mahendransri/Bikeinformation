package org.bike;

public class ktm implements Bike{

	@Override
	public void cost() {
		System.out.println("1.25lakh");
		
	}

	@Override
	public void speed() {
		System.out.println("150km/hrs");
		
	}
	public static void main(String[] args) {
		ktm k = new ktm();
		k.cost();
		k.speed();
	}

}
