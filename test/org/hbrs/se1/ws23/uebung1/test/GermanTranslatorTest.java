package org.hbrs.se1.ws23.uebung1.test;

import org.hbrs.se1.ws23.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    //Test ob bei Eingabe einer legalen Zahl auch das Gewollte herauskommt
    @Test
    void aPositiveTest() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(0);
        assertEquals(value, "null");
    }

    //Test ob bei Eingabe einer illegalen Zahl auch das Gewollte herauskommt
    @Test
    void aNegativeTest() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(-2);
        assertEquals(value,"Übersetzung der Zahl -2 nicht möglich ([ 1.0 ])");
    }

    @Test
    void aNegativeTest3() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(13);
        assertEquals(value,"Übersetzung der Zahl 13 nicht möglich ([ 1.0 ])");
    }

    //Test ob bei einer Eingabe einer illegalen Zahl kein ungewolltes Ergebnis herauskommt
    @Test
    void aNegativeTest2() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(-33);
        assertNotEquals(value,"dreiunddreißig");
    }

    //Test ob Randfälle richtiges Ergebnis werfen
    @Test
    void aPositiveTest2() {
        GermanTranslator translator = new GermanTranslator();
        String value = translator.translateNumber(10);
        assertEquals(value,"zehn");
    }
}