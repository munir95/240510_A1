/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum.mavenproject1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Owner
 */
public class Count_issueTest {
    
    public Count_issueTest() {
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
     * Test of linked list method, of class Count_issue.
     */
    @Test
    public void testLinkedlist() {
        System.out.println("linkedlist");
        File file = new File(Path.getPath());
        Collection<File> all = new ArrayList<>();
        Count_issue.linkedlist(file, all);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of on method, of class Count_issue.
     */
    @Test
    public void testOn() {
        System.out.println("on");
        String[] javallist = new String[new ArrayList<>().size()];
        Count_issue instance = new Count_issue();
        int expResult = 0;
        int result = instance.on(javallist);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
