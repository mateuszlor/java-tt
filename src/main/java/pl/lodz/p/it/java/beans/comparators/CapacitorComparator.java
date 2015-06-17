/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.beans.comparators;

import java.util.Comparator;
import pl.lodz.p.it.java.model.Capacitors;
import pl.lodz.p.it.java.model.Element;
import pl.lodz.p.it.java.model.Resistors;

public class CapacitorComparator implements Comparator<Capacitors> {

    @Override
    public int compare(Capacitors o1, Capacitors o2) {
        return Boolean.compare(o1.isUsed(), o2.isUsed());
    }

}
