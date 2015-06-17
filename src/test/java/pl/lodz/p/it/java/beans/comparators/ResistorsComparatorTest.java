/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.p.it.java.beans.comparators;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pl.lodz.p.it.java.model.Resistors;

/**
 *
 * @author Mateusz
 */
public class ResistorsComparatorTest {
    
    public ResistorsComparatorTest() {
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
     * Test of compare method, of class ResistorsComparator.
     */
    @Test
    public void testCompare() {
        System.out.println("compare");
        Resistors o1 = new Resistors();
        Resistors o2 = new Resistors();
        ResistorsComparator instance = new ResistorsComparator();
        int expResult = 0;
        int result = instance.compare(o1, o2);
        assertEquals(expResult, result);
    }
    
}
