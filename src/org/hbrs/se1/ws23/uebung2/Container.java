package org.hbrs.se1.ws23.uebung2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Container {
    List<Member> container = new ArrayList<>();
    int size = 0; //Groessencounter
    ; //Für die interne Speicherung von Objekten wird eine Listen-Datenstruktur verwendet
    public void addMember(Member member) throws ContainerException {
        if (container.contains(member)) {
            throw new ContainerException("Das Member-Objekt mit der ID " + member.getID() + " ist bereits vorhanden!");
        } else {
            container.add(member);
            ++size;
        }
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

    public void dump() {
        for (Member member : container) {
            System.out.println(member.toString());
        }
    }

    public int size() {
        return size;
    }

}
