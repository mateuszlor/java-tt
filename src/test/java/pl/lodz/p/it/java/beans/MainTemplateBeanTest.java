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

/**
 *
 * @author Mateusz
 */
public class MainTemplateBeanTest {
    
    public MainTemplateBeanTest() {
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
     * Test of year method, of class MainTemplateBean.
     */
    @Test
    public void testYear() {
        System.out.println("year");
        MainTemplateBean instance = new MainTemplateBean();
        String expResult = "2015";
        String result = instance.year();
        assertEquals(expResult, result);
    }
    
}
