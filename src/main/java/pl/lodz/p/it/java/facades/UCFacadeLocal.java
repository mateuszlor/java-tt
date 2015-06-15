/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.facades;

import java.util.List;
import javax.ejb.Local;
import pl.lodz.p.it.java.model.UCs;

/**
 *
 * @author Mateusz
 */
@Local
public interface UCFacadeLocal {

    void create(UCs uC);

    void edit(UCs uC);

    void remove(UCs uC);

    UCs find(Object id);

    List<UCs> findAll();

    List<UCs> findRange(int[] range);

    int count();
    
}
