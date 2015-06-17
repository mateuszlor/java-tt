/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.beans;

import java.util.List;
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
public class AddElementBeanTest {
    
    public AddElementBeanTest() {
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
     * Test of getChoosenResistors method, of class AddElementBean.
     */
    @Test
    public void testGetChoosenResistors() {
        System.out.println("getChoosenResistors");
        AddElementBean instance = new AddElementBean();
        List<String> expResult = null;
        List<String> result = instance.getChoosenResistors();
        assertEquals(expResult, result);
    }

    /**
     * Test of setChoosenResistors method, of class AddElementBean.
     */
    @Test
    public void testSetChoosenResistors() {
        System.out.println("setChoosenResistors");
        List<String> choosenResistors = null;
        AddElementBean instance = new AddElementBean();
        instance.setChoosenResistors(choosenResistors);
    }

    /**
     * Test of getChoosenCapacitors method, of class AddElementBean.
     */
    @Test
    public void testGetChoosenCapacitors() {
        System.out.println("getChoosenCapacitors");
        AddElementBean instance = new AddElementBean();
        List<String> expResult = null;
        List<String> result = instance.getChoosenCapacitors();
        assertEquals(expResult, result);
    }

    /**
     * Test of setChoosenCapacitors method, of class AddElementBean.
     */
    @Test
    public void testSetChoosenCapacitors() {
        System.out.println("setChoosenCapacitors");
        List<String> choosenCapacitors = null;
        AddElementBean instance = new AddElementBean();
        instance.setChoosenCapacitors(choosenCapacitors);
    }

    /**
     * Test of getChoosenUcs method, of class AddElementBean.
     */
    @Test
    public void testGetChoosenUcs() {
        System.out.println("getChoosenUcs");
        AddElementBean instance = new AddElementBean();
        List<String> expResult = null;
        List<String> result = instance.getChoosenUcs();
        assertEquals(expResult, result);
    }

    /**
     * Test of setChoosenUcs method, of class AddElementBean.
     */
    @Test
    public void testSetChoosenUcs() {
        System.out.println("setChoosenUcs");
        List<String> choosenUcs = null;
        AddElementBean instance = new AddElementBean();
        instance.setChoosenUcs(choosenUcs);
    }

    /**
     * Test of getResistors method, of class AddElementBean.
     */
    @Test
    public void testGetResistors() {
        System.out.println("getResistors");
        AddElementBean instance = new AddElementBean();
        List<Resistors> expResult = null;
        List<Resistors> result = instance.getResistors();
        assertEquals(expResult, result);
    }

    /**
     * Test of setResistors method, of class AddElementBean.
     */
    @Test
    public void testSetResistors() {
        System.out.println("setResistors");
        List<Resistors> resistors = null;
        AddElementBean instance = new AddElementBean();
        instance.setResistors(resistors);
    }

    /**
     * Test of getCapacitors method, of class AddElementBean.
     */
    @Test
    public void testGetCapacitors() {
        System.out.println("getCapacitors");
        AddElementBean instance = new AddElementBean();
        List<Capacitors> expResult = null;
        List<Capacitors> result = instance.getCapacitors();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCapacitors method, of class AddElementBean.
     */
    @Test
    public void testSetCapacitors() {
        System.out.println("setCapacitors");
        List<Capacitors> capacitors = null;
        AddElementBean instance = new AddElementBean();
        instance.setCapacitors(capacitors);
    }

    /**
     * Test of getUcs method, of class AddElementBean.
     */
    @Test
    public void testGetUcs() {
        System.out.println("getUcs");
        AddElementBean instance = new AddElementBean();
        List<UCs> expResult = null;
        List<UCs> result = instance.getUcs();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUcs method, of class AddElementBean.
     */
    @Test
    public void testSetUcs() {
        System.out.println("setUcs");
        List<UCs> ucs = null;
        AddElementBean instance = new AddElementBean();
        instance.setUcs(ucs);
    }

    /**
     * Test of getProject method, of class AddElementBean.
     */
    @Test
    public void testGetProject() {
        System.out.println("getProject");
        AddElementBean instance = new AddElementBean();
        Projects expResult = null;
        Projects result = instance.getProject();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProject method, of class AddElementBean.
     */
    @Test
    public void testSetProject() {
        System.out.println("setProject");
        Projects project = null;
        AddElementBean instance = new AddElementBean();
        instance.setProject(project);
    }    
}
