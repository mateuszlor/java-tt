/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.facades;

import java.util.List;
import javax.ejb.Local;
import pl.lodz.p.it.java.model.Resistors;

/**
 *
 * @author Mateusz
 */
@Local
public interface ResistorFacadeLocal {

    void create(Resistors resistor);

    void edit(Resistors resistor);

    void remove(Resistors resistor);

    Resistors find(Object id);

    List<Resistors> findAll();

    List<Resistors> findRange(int[] range);

    int count();
    
}
