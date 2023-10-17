package org.hbrs.se1.ws23.uebung1.view;

import com.sun.java.accessibility.util.Translator;
import org.hbrs.se1.ws23.uebung1.control.Factory;
import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;

public class Client {
	private GermanTranslator translatorGerman;
	public Client(GermanTranslator translatorGerman) { //Übergebe Client Klasse ein Translator Objekt durch Konstruktor
		this.translatorGerman = translatorGerman;
	}

	//In der Client Klasse soll Factory Klasse verwendet werden, um gewünschte Objekte zu erstellen

		/*
		 * Methode zur Ausgabe einer Zahl auf der Console
		 * (auch bezeichnet als CLI, Terminal)
		 *
		 */
		 void display( int aNumber ){
			// In dieser Methode soll die Methode translateNumber
			// mit dem übergegebenen Wert der Variable aNumber
			// aufgerufen werden.
			//
			// Strenge Implementierung gegen das Interface Translator gewuenscht!

			String Uebersetzung = translatorGerman.translateNumber(aNumber);








			System.out.println("Das Ergebnis der Berechnung: " +
					Uebersetzung  );

		 }
}





