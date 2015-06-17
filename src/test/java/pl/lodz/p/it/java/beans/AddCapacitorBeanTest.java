/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.beans;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pl.lodz.p.it.java.model.Capacitors;
import pl.lodz.p.it.java.model.CapacityUnit;

/**
 *
 * @author Mateusz
 */
public class AddCapacitorBeanTest {
    
    public AddCapacitorBeanTest() {
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
     * Test of getCapacitor method, of class AddCapacitorBean.
     */
    @Test
    public void testGetCapacitor() {
        System.out.println("getCapacitor");
        AddCapacitorBean instance = new AddCapacitorBean();
        Capacitors expResult = null;
        Capacitors result = instance.getCapacitor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCapacitor method, of class AddCapacitorBean.
     */
    @Test
    public void testSetCapacitor() {
        System.out.println("setCapacitor");
        Capacitors capacitor = null;
        AddCapacitorBean instance = new AddCapacitorBean();
        instance.setCapacitor(capacitor);
    }

    /**
     * Test of getValues method, of class AddCapacitorBean.
     */
    @Test
    public void testGetValues() {
        System.out.println("getValues");
        AddCapacitorBean instance = new AddCapacitorBean();
        CapacityUnit[] expResult = null;
        CapacityUnit[] result = instance.getValues();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getCapacity method, of class AddCapacitorBean.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        AddCapacitorBean instance = new AddCapacitorBean();
        int expResult = 0;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCapacity method, of class AddCapacitorBean.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 0;
        AddCapacitorBean instance = new AddCapacitorBean();
        instance.setCapacity(capacity);
    }

    /**
     * Test of getUnit method, of class AddCapacitorBean.
     */
    @Test
    public void testGetUnit() {
        System.out.println("getUnit");
        AddCapacitorBean instance = new AddCapacitorBean();
        CapacityUnit expResult = null;
        CapacityUnit result = instance.getUnit();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUnit method, of class AddCapacitorBean.
     */
    @Test
    public void testSetUnit() {
        System.out.println("setUnit");
        CapacityUnit unit = null;
        AddCapacitorBean instance = new AddCapacitorBean();
        instance.setUnit(unit);
    }
    
}
