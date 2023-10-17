package org.hbrs.se1.ws23.uebung1.control;

//Factory Klasse erstellen
//Für Abgabe: File -> Export
//Falls neue Übung auftaucht auf Update gehen (blauer Pfeil oben rechts)
public class Factory {
    public Translator createTranslator() { //Factory-Methode
        return new GermanTranslator();
    }
}
