package org.lessons.java.shop;

import java.util.Random;

//initialize the constructor
public class Prodotto {
	int codeNumber;
	String nameShort;
	String descriptionProduct;
	float netPrice;
	int ivaValue;

	Random random = new Random();

	public Prodotto(String name, String description, float price, int iva) {
		codeNumber = Math.abs(random.nextInt());
		nameShort = name;
		descriptionProduct = description;
		netPrice = price;
		ivaValue = iva;
	}

	// method for base price
	public void price() {
		System.out.println(netPrice);
	}

	// method for code+name
	public String completeName(int codeNumber, String nameShort) {
		return codeNumber + "-" + nameShort;
	}

	// method for gross price
	public float grossPrice(float netPrice, int ivaValue) {
		return netPrice + (netPrice * ivaValue) / 100;
	}
}
