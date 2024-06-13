package org.lessons.java.shop;

import java.text.DecimalFormat;

public class test {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		Prodotto bottle = new Prodotto("acqua", "bottiglia", 3.01f, 10);
		
		//display formatted gross price
		System.out.println(df.format(bottle.grossPrice(bottle.netPrice, bottle.ivaValue)));
		
		//display formatted net price
		bottle.price();
		
		//display the complete name
		System.out.println(bottle.completeName(bottle.codeNumber, bottle.nameShort));
		
	}

}
