/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pl.lodz.p.it.java.model.Capacitors;

/**
 *
 * @author Mateusz
 */
@Stateless
public class CapacitorFacade extends AbstractFacade<Capacitors> implements CapacitorFacadeLocal {
    @PersistenceContext(unitName = "pl.lodz.p.it.java_catalog_war_0.0.1-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CapacitorFacade() {
        super(Capacitors.class);
    }
    
}
