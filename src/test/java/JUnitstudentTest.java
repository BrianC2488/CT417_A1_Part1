/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.brian.coughlan.ct417_a1_part1.student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brian
 */
public class JUnitstudentTest {
    
      @Test
      public void getUsername_Test(){
        student s = new student("Brian Coughlan",22,"25/08/1996","4BP");
        String expected = "Brian_Coughlan_22";
        assertEquals(expected, s.getUsername());
    }
      @Test
    public void getDOB()
    {
        student s = new student("Brian Coughlan",22,"25/08/1996","4BP");
        String expected = "25/08/1996";
        assertEquals(expected, s.getDOB());
 
    }
    
    public JUnitstudentTest() {
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

  
    
}
