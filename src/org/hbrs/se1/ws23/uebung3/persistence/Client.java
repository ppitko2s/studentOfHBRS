package org.hbrs.se1.ws23.uebung3.persistence;

import org.hbrs.se1.ws23.uebung2.ConcreteMember;
import org.hbrs.se1.ws23.uebung2.Container;
import org.hbrs.se1.ws23.uebung2.ContainerException;
import org.hbrs.se1.ws23.uebung2.Member;

public class Client {
    static Member m1;
    static Member m2;
    static Member m3;
    static Container container;
    static MemberView mv;

    public static void main (String[] args) throws ContainerException {
        m1 = new ConcreteMember(1);
        m2 = new ConcreteMember(2);
        m3 = new ConcreteMember(3);

        container.addMember(m1);
        container.addMember(m2);
        container.addMember(m3);
        mv.dump(Container.getCurrentList());
    }


}
