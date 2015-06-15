/*
 * To change this license header, choose License Headers in Projects Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.facades;

import java.util.List;
import javax.ejb.Local;
import pl.lodz.p.it.java.model.Projects;

/**
 *
 * @author Mateusz
 */
@Local
public interface ProjectFacadeLocal {

    void create(Projects project);

    void edit(Projects project);

    void remove(Projects project);

    Projects find(Object id);

    List<Projects> findAll();

    List<Projects> findRange(int[] range);

    int count();
    
}
