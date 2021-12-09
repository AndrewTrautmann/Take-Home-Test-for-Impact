/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import questionforimpact.Summarizer;

/**
 *
 * @author Andrew_Trautmann
 */
public class SummarizerTest {
    
    private static Summarizer summarizer;
    private static Collection<Integer> expectedCollection;
    private static Collection<Integer> actualCollection;
    private static String expectedResult; 
    private static String actualResult; 
    
    public SummarizerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        // Creating an instance of the Summarizer class
        summarizer = new Summarizer();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        // Setting up for testCollect      
        String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        expectedCollection = new ArrayList<Integer>();
        expectedCollection.add(1);
        expectedCollection.add(3);
        expectedCollection.add(6);
        expectedCollection.add(7);
        expectedCollection.add(8);
        expectedCollection.add(12);
        expectedCollection.add(13);
        expectedCollection.add(14);
        expectedCollection.add(15);
        expectedCollection.add(21);
        expectedCollection.add(22);
        expectedCollection.add(23);
        expectedCollection.add(24);
        expectedCollection.add(31);
        actualCollection = summarizer.collect(input);
        
        
        // Setup for testSummarizeCollection
        expectedResult = "1, 3, 6-8, 12-15, 21-24, 31";
        actualResult = summarizer.summarizeCollection(actualCollection);        
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testArea(){        
        assertEquals(expectedResult, actualResult);
    }
}
