/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sam
 */
public class UtilsIT {
    
    public UtilsIT() {
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
     * Test of readFile method, of class Utils.
     * @throws java.io.IOException
     */
    @Test
    public void testReadFile() throws IOException {
        System.out.println("readFile");
        String fileName = "";
        String expResult = "";
        String result = Utils.readFile(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeFile method, of class Utils.
     * @throws java.lang.Exception
     */
    @Test
    public void testWriteFile() throws Exception {
        System.out.println("writeFile");
        String fileName = "";
        String data = "";
        Utils.writeFile(fileName, data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of join method, of class Utils.
     */
    @Test
    public void testJoin() {
        System.out.println("join");
        Object[] items = null;
        String seperator = "";
        String expResult = "";
        String result = Utils.join(items, seperator);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
