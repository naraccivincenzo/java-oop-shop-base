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

	public Prodotto(int code, String name, String description, float price, int iva) {
		codeNumber = Math.abs(random.nextInt());
		nameShort = name;
		descriptionProduct = description;
		netPrice = price;
		ivaValue = iva;
	}

	// method for base price
	void price() {
		System.out.println(netPrice);
	}

	// method for code+name
	String completeName(int codeNumber, String nameShort) {
		String completeName = codeNumber + "-" + nameShort;
		return completeName;
	}

	// method for gross price
	float grossPrice(float netPrice, int ivaValue) {
		float grossPrice = netPrice + (netPrice * ivaValue) / 100;
		return grossPrice;
	}
}
