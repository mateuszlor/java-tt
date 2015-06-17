/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.beans;

import javax.faces.model.DataModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pl.lodz.p.it.java.model.Capacitors;
import pl.lodz.p.it.java.model.Projects;
import pl.lodz.p.it.java.model.Resistors;
import pl.lodz.p.it.java.model.UCs;

/**
 *
 * @author Mateusz
 */
public class ListPageBeanTest {
    
    public ListPageBeanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getProjectsDataModel method, of class ListPageBean.
     */
    @Test
    public void testGetProjectsDataModel() {
        System.out.println("getProjectsDataModel");
        ListPageBean instance = new ListPageBean();
        DataModel<Projects> expResult = null;
        DataModel<Projects> result = instance.getProjectsDataModel();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProjectsDataModel method, of class ListPageBean.
     */
    @Test
    public void testSetProjectsDataModel() {
        System.out.println("setProjectsDataModel");
        DataModel<Projects> projectsDataModel = null;
        ListPageBean instance = new ListPageBean();
        instance.setProjectsDataModel(projectsDataModel);
    }

    /**
     * Test of getResistorsDataModel method, of class ListPageBean.
     */
    @Test
    public void testGetResistorsDataModel() {
        System.out.println("getResistorsDataModel");
        ListPageBean instance = new ListPageBean();
        DataModel<Resistors> expResult = null;
        DataModel<Resistors> result = instance.getResistorsDataModel();
        assertEquals(expResult, result);
    }

    /**
     * Test of setResistorsDataModel method, of class ListPageBean.
     */
    @Test
    public void testSetResistorsDataModel() {
        System.out.println("setResistorsDataModel");
        DataModel<Resistors> resistorsDataModel = null;
        ListPageBean instance = new ListPageBean();
        instance.setResistorsDataModel(resistorsDataModel);
    }

    /**
     * Test of getCapacitorsDataModel method, of class ListPageBean.
     */
    @Test
    public void testGetCapacitorsDataModel() {
        System.out.println("getCapacitorsDataModel");
        ListPageBean instance = new ListPageBean();
        DataModel<Capacitors> expResult = null;
        DataModel<Capacitors> result = instance.getCapacitorsDataModel();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCapacitorsDataModel method, of class ListPageBean.
     */
    @Test
    public void testSetCapacitorsDataModel() {
        System.out.println("setCapacitorsDataModel");
        DataModel<Capacitors> capacitorsDataModel = null;
        ListPageBean instance = new ListPageBean();
        instance.setCapacitorsDataModel(capacitorsDataModel);
    }

    /**
     * Test of getUcsDataModel method, of class ListPageBean.
     */
    @Test
    public void testGetUcsDataModel() {
        System.out.println("getUcsDataModel");
        ListPageBean instance = new ListPageBean();
        DataModel<UCs> expResult = null;
        DataModel<UCs> result = instance.getUcsDataModel();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUcsDataModel method, of class ListPageBean.
     */
    @Test
    public void testSetUcsDataModel() {
        System.out.println("setUcsDataModel");
        DataModel<UCs> ucsDataModel = null;
        ListPageBean instance = new ListPageBean();
        instance.setUcsDataModel(ucsDataModel);
    }
}
