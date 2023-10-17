package org.hbrs.se1.ws23.uebung1.control;

import java.util.HashMap;
import java.util.Map;

public class GermanTranslator implements Translator {

	public String date = "Okt/2023"; // Default-Wert

	/**
	 * Methode zur Übersetzung einer Zahl in eine String-Repraesentation
	 */
	public String translateNumber( int number ) {
		// [ihr Source Code aus Übung 1-2]
		Map<Integer, String> translations = new HashMap<>(); //Map als geeignete Datenstruktur
			translations.put(0, "null");
			translations.put(1, "eins");
			translations.put(2, "zwei");
			translations.put(3, "drei");
			translations.put(4, "vier");
			translations.put(5, "fünf");
			translations.put(6, "sechs");
			translations.put(7, "sieben");
			translations.put(8, "acht");
			translations.put(9, "neun");
			translations.put(10, "zehn");

		//getOrDefault Methode benutzen für richtige und falsche Eingaben
		return translations.getOrDefault(number, "Übersetzung der Zahl " + number + " nicht möglich ([" + version + "])");
	}

	/**
	 * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
	 */
	public void printInfo(){
		System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
	}

	/**
	 * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: "Okt/2022"))
	 * Das Datum sollte system-intern durch eine Control-Klasse gesetzt werden und nicht von externen View-Klassen
	 */
	public void setDate( String date ) {
		this.date = date;
	}

}
