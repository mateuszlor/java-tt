/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.facades;

import java.util.List;
import javax.ejb.Local;
import pl.lodz.p.it.java.model.Capacitors;

/**
 *
 * @author Mateusz
 */
@Local
public interface CapacitorFacadeLocal {

    void create(Capacitors capacitor);

    void edit(Capacitors capacitor);

    void remove(Capacitors capacitor);

    Capacitors find(Object id);

    List<Capacitors> findAll();

    List<Capacitors> findRange(int[] range);

    int count();
    
}
