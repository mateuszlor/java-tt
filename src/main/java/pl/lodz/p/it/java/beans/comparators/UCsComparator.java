/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.beans.comparators;

import java.util.Comparator;
import pl.lodz.p.it.java.model.UCs;

public class UCsComparator implements Comparator<UCs> {

    @Override
    public int compare(UCs o1, UCs o2) {
        return Boolean.compare(o1.isUsed(), o2.isUsed());
    }

}
