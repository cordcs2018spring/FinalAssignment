/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizbuilder1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
public class ChoiceQuestionTest {
    
    public ChoiceQuestionTest() {
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
     * Test of addChoice method, of class ChoiceQuestion.
     */
    @Test
    public void testAddChoice() {
        System.out.println("addChoice");
        String Choice = "";
        ChoiceQuestion instance = new ChoiceQuestion();
        instance.addChoice(Choice);
         int expResult=1;
        int itemNum=instance.getChoices().size();
        assertEquals(expResult,itemNum);
    }

    /**
     * Test of DisplayQuest method, of class ChoiceQuestion.
     */
    @Test
    public void testDisplayQuest() {
      ByteArrayOutputStream outContent = new ByteArrayOutputStream();
      System.setOut(new PrintStream(outContent));
      System.out.println("DisplayQuest");
        ChoiceQuestion instance = new ChoiceQuestion();
        String q="hello";
        instance.settext(q);
        instance.addChoice("world");
        instance.DisplayQuest();
        String expoutPut="hello\n1:world";

    }

    /**
     * Test of setRight method, of class ChoiceQuestion.
     */
    @Test
    public void testSetRight() {
        System.out.println("setRight");
        String num = "";
        boolean right = false;
        ChoiceQuestion instance = new ChoiceQuestion();
       instance.settext("hello");
       instance.addChoice(num);
       String rightAnswer="1";
        instance.setRight(rightAnswer, right);
       boolean testResult= instance.checkAnswer("1");
       boolean expAnswer=false;
       assertEquals(expAnswer,testResult);

    }
    
}
