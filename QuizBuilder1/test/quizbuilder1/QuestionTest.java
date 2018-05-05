/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizbuilder1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Saber
 */
public class QuestionTest {
    
    public QuestionTest() {
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
     * Test of getText method, of class Question.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        Question instance = new Question();
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of settext method, of class Question.
     */
    @Test
    public void testSettext() {
        System.out.println("settext");
        String question = "";
        Question instance = new Question();
        instance.settext(question);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnswer method, of class Question.
     */
    @Test
    public void testGetAnswer() {
        System.out.println("getAnswer");
        Question instance = new Question();
        String expResult = "";
        String result = instance.getAnswer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnswer method, of class Question.
     */
    @Test
    public void testSetAnswer() {
        System.out.println("setAnswer");
        String rightAnswer = "";
        Question instance = new Question();
        instance.setAnswer(rightAnswer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkAnswer method, of class Question.
     */
    @Test
    public void testCheckAnswer() {
        Scanner in=new Scanner(System.in);
        System.out.println("checkAnswer");
        String resp = "";
        Question instance = new Question();
        instance.setAnswer(resp);
        boolean expResult = true;
        boolean result = instance.checkAnswer(resp);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of DisplayQuest method, of class Question.
     */
    @Test
    public void testDisplayQuest() throws Exception {
       ByteArrayOutputStream outContent = new ByteArrayOutputStream();
      System.setOut(new PrintStream(outContent));
      System.out.println("DisplayQuest");
        Question instance = new Question();
       String txt="hello world";
        instance.settext(txt);
        instance.DisplayQuest();
        String expOutput="DisplayQuest "+txt+" ";
        assertEquals(expOutput,outContent.toString());
        
    }
    
}
