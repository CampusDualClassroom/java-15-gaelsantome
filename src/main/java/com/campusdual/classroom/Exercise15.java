package com.campusdual.classroom;

import java.util.Calendar;

public class Exercise15 {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		calendario.add(Calendar.MONTH, 1 );
		FreshMerchandise fm = new FreshMerchandise("Manzanas", "001-9", "Frutería de ayer S.L.", 8, "C", "114D", 53,
				calendario.getTime());
		fm.printSpecificData();
		System.out.println(fm.getLocation());

	}

}
