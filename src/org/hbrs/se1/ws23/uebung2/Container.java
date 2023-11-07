package org.hbrs.se1.ws23.uebung2;

import org.hbrs.se1.ws23.uebung3.persistence.MemberView;
import org.hbrs.se1.ws23.uebung3.persistence.PersistenceException;
import org.hbrs.se1.ws23.uebung3.persistence.PersistenceStrategy;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Container {
    private PersistenceStrategy<String> persistenceStrategy = null;
    private static List<Member> container = new ArrayList<>(); //static aufgrund private static aufgrund Singelton-Pattern
    int size = 0; //Groessencounter
    ; //Für die interne Speicherung von Objekten wird eine Listen-Datenstruktur verwendet
    private Container(){} //privater Konstruktor Singelton-Pattern

    public static List<Member> getInstance() { //returned die einzige Instanz
        return container;
    }

    public void setPersistenceStrategy(PersistenceStrategy<String> strategy) {
        this.persistenceStrategy = strategy;
    }

    public void addMember(Member member) throws ContainerException {
        if (contains(member)) {
            throw new ContainerException("Das Member-Objekt mit der ID " + member.getID() + " ist bereits vorhanden!");
        } else {
            container.add(member);
            ++size;
        }
    }

    //Hilfsmethode aus Lösung ergänzt
    private boolean contains(Member r) {
        Integer ID = r.getID();
        for (Member rec : container) {
            // wichtig: Check auf die Values innerhalb der Integer-Objekte!
            if ( rec.getID().intValue() == ID.intValue() ) {
                return true;
            }
        }
        return false;

        // liste.contains(r), falls equals-Methode in Member ueberschrieben.
    }
    public String deleteMember(Integer id) {
        for (Member member : container) {
            if (member.getID().equals(id)) {
                container.remove(member);
                --size;
                return "Member mit ID " + id + " geloescht!";
            }
        }
        return "Member mit ID " + id + " nicht gefunden!";
    }
    //Kurzes Statement zu FA2:

    public static void dump() {
        for (Member member : container) {
            System.out.println(member.toString());
        }
    }

    public int size() {
        return size;
    }

    //store() und load() soll aus der Persistenz-Strategie von ausserhalb hervorkommen

    public static List<Member> getCurrentList() {
        return container;
    }



}
