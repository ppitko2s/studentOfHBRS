package org.hbrs.se1.ws23.uebung2.test;

import org.hbrs.se1.ws23.uebung2.ConcreteMember;
import org.hbrs.se1.ws23.uebung2.Container;
import org.hbrs.se1.ws23.uebung2.ContainerException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class ContainerTest {
    private Container container;
    private ConcreteMember member1;
    private ConcreteMember member2;

    @BeforeEach
    void setup() {
        container = new Container();
        member1 = new ConcreteMember(1);
        member2 = new ConcreteMember(2);
    }

    @Test
    void test0() {
        //Test auf leeren Container (ist size = 0?)
        Assertions.assertEquals(0, container.size());
    }

    @Test
    void test1() throws ContainerException {
        //Hinzufügen von neuem Member (ist size = 1?)
        container.addMember(member1);
        Assertions.assertEquals(1, container.size());
    }


    @Test
    void test2() throws ContainerException {
        //Hinzufügen des weiteren members (ist size = 2?)
        container.addMember(member1);
        container.addMember(member2);
        Assertions.assertEquals(2, container.size());
    }

    @Test
    void test3() throws ContainerException {
        //Checken, ob eingefügte Member wieder gelöscht wurden (ist size = 1?)
        container.addMember(member1);
        container.addMember(member2);
        Assertions.assertEquals(2, container.size());
        container.deleteMember(member2.getID());
        Assertions.assertEquals(1, container.size());
    }

    @Test
    void test4() throws ContainerException {
        //Checken, ob ContainerException geworfen wird wenn bereits vorhandener Member eingefügt wird
        container.addMember(member1);
        container.addMember(member1);
        Assertions.assertThrows(ContainerException.class,()->container.addMember(member1));
    }

    @Test
    void test5() {
        //Checken, ob Container-Size sich nicht ändert wenn bereits vorhandener Member eingefügt wird
        try {
            container.addMember(member1);
            container.addMember(member2);
            container.addMember(member2);
        } catch (ContainerException ignored) { //ignoriere gefangene Exception
        }
        Assertions.assertEquals(2, container.size());
    }

    @Test
    void test6() throws ContainerException {
        //Aufruf von size() verändert nicht die aktuelle Container-Size
        container.addMember(member1);
        container.size();
        Assertions.assertEquals(1, container.size());
    }

    @Test
    void test7() {
        //Checken, ob size gleichbleibt wenn ich einen nicht im Container vorhandenen Member entferne
        try {
            container.addMember(member1);
            container.addMember(member2);
            container.deleteMember(4);
        } catch (ContainerException ignored) {
        }
        Assertions.assertEquals(2,container.size());
    }

    @Test
    void test8() throws ContainerException {
        //Checken, ob size verringert wird
        container.addMember(member1);
        container.addMember(member2);
        container.deleteMember(1);
        Assertions.assertEquals(1, container.size());
    }

    @Test
    void test9() throws ContainerException {
        //Checken, ob Container leer ist, wenn alle Member entfernt sind
        container.addMember(member1);
        container.addMember(member2);
        container.deleteMember(1);
        container.deleteMember(2);
        Assertions.assertEquals(0,container.size());
    }



}