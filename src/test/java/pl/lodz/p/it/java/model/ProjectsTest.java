/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.model;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mateusz
 */
public class ProjectsTest {
    
    public ProjectsTest() {
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
     * Test of getId method, of class Projects.
     */
    @org.junit.Test
    public void testGetId() {
        System.out.println("getId");
        Projects instance = new Projects();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Projects.
     */
    @org.junit.Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Projects instance = new Projects();
        instance.setId(id);
    }

    /**
     * Test of getDescription method, of class Projects.
     */
    @org.junit.Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Projects instance = new Projects();
        String expResult = null;
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescription method, of class Projects.
     */
    @org.junit.Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Projects instance = new Projects();
        instance.setDescription(description);
    }

    /**
     * Test of setResistors method, of class Projects.
     */
    @org.junit.Test
    public void testSetResistors() {
        System.out.println("setResistors");
        List<Resistors> resistors = null;
        Projects instance = new Projects();
        instance.setResistors(resistors);
    }

    /**
     * Test of setUcs method, of class Projects.
     */
    @org.junit.Test
    public void testSetUcs() {
        System.out.println("setUcs");
        List<UCs> ucs = null;
        Projects instance = new Projects();
        instance.setUcs(ucs);
    }

    /**
     * Test of getStatus method, of class Projects.
     */
    @org.junit.Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Projects instance = new Projects();
        ProjectStatus expResult = ProjectStatus.planned;
        ProjectStatus result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatus method, of class Projects.
     */
    @org.junit.Test
    public void testSetStatus() {
        System.out.println("setStatus");
        ProjectStatus status = null;
        Projects instance = new Projects();
        instance.setStatus(status);
    }

    /**
     * Test of addCapacitor method, of class Projects.
     */
    @org.junit.Test
    public void testAddCapacitor() {
        System.out.println("addCapacitor");
        Capacitors capacitor = new Capacitors();
        Projects instance = new Projects();
        instance.addCapacitor(capacitor);
        assertTrue(instance.getCapacitors().contains(capacitor));
    }

    /**
     * Test of addResistor method, of class Projects.
     */
    @org.junit.Test
    public void testAddResistor() {
        System.out.println("addResistor");
        Resistors resistors = new Resistors();
        Projects instance = new Projects();
        instance.addResistor(resistors);
        assertTrue(instance.getResistors().contains(resistors));
    }

    /**
     * Test of addUC method, of class Projects.
     */
    @org.junit.Test
    public void testAddUC() {
        System.out.println("addUC");
        UCs uc = new UCs();
        Projects instance = new Projects();
        instance.addUC(uc);
        assertTrue(instance.getUcs().contains(uc));
    }

    /**
     * Test of hashCode method, of class Projects.
     */
    @org.junit.Test
    public void testHashCode() {
        System.out.println("hashCode");
        Projects instance = new Projects();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Projects.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Projects instance = new Projects();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }    
}
