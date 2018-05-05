
package quizbuilder1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.Scanner;
import javax.swing.JFrame;


// main class that contains all the loops, formattings and booleans to execute the program 
public class QuizBuilder1 {
private Question ques;
private ChoiceQuestion cques;
private int count;
public static boolean looper=true;
public static boolean looperIn=true;

    public static void main(String[] args) {
        
        
        System.out.println("                                       **************QUIZ BUILDER******************                           ");
        System.out.println("                                                PRESS 'A' TO CONTINUE");
        System.out.println("                                                    'Q' to Quit.");
        System.out.println("===>");
        Scanner in= new Scanner(System.in);
        
        while (looper){
            
        
        String letter=in.next();
        switch(letter.toUpperCase()){
            case "A":
              
             System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
              System.out.println("Enter the subject of the course: ");
                String name= in.next();
                
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("Enter Quiz Number :  ");
                int qn=in.nextInt();
                
                
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println(" How many questions would you like to prepare?");
                int numQ=in.nextInt();
                
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("How many of them should be multiple choice question?");
                int Cn=in.nextInt();
                
                
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("And how many of them short answer questions?");
                int Sn=in.nextInt();
                
               ArrayList <Question> c=new ArrayList<Question>();
               ArrayList <ChoiceQuestion> g=new ArrayList<ChoiceQuestion>();
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");

       
                
               
               
               for(int i=0;i<numQ;i++){
                   looperIn=true;
                   while (looperIn){
               
                   System.out.println("                                                      [[Question form]] ");
                   System.out.println("                                  press 'C' for Multiple Choice Question and 'S' for short answer");
              
                   String type=in.next();
               
                   
                switch(type.toUpperCase()){
                    case "S":
                        
                           Question f= new Question();
                        
                           System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                        System.out.println("   Enter your question please : ");
                        
                        String q=in.next();
                        q+=in.nextLine();
                        
                        f.settext(q);
                        
                        System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                        System.out.println("Set the answer for this question : ");
                        
                        String ans=in.next();
                        f.setAnswer(ans);
                        c.add(f);
                        
                        looperIn=false;
                        
                    break;
                    case "C":
                        ChoiceQuestion cq=new ChoiceQuestion();
                        cq.setID(i+1);
                        System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                        System.out.println("Enter your question please : ");
                        String d=in.next();
                        d+=in.nextLine();
                       
                        
                        
                        cq.settext(d);
                        
                        
                        for(int x=0;x<4;x++){
                            System.out.println();
                
                System.out.println();
                
                        System.out.println("Enter your choice : ");
                        System.out.println();
                        String ch=in.next();
                        cq.addChoice(ch.toUpperCase());
                        }
                        
                         System.out.println(); 
                         System.out.println();
                        System.out.println(" Which one was the right choice?");
                        String corrc=in.next();
                        cq.setRight(corrc, true);
                        g.add(cq);
                        looperIn=false;
                        break;
               
                
                         case "Q": 
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("Thank You!!!");
                System.exit(0);
            looperIn=false;
                break;
                        
               
                         default:
                             
                        System.out.println("Invalid Input");
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        looperIn=true;
                }}
               }
               
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("Thank You !!!!!");
                
               
                System.out.println("                                   "+name+"Quiz#"+qn);

                
                
        if(g.size()>0){
                 System.out.println("CHOICE QUESTIONS");
                 Collections.sort(g, new Comparator<ChoiceQuestion>()
                 {
                     public int compare(ChoiceQuestion one,ChoiceQuestion two){
                         return Integer.valueOf(two.getID()).compareTo(one.getID());
                     }
                 });
                 QuizBuilder1.DisplayQuestions(g);
                 System.out.println();}

                if(c.size()>0){ 
                    System.out.println("Short Answer Questions");
                   Collections.sort(c, new Comparator<Question>()
                 {
                     public int compare(Question one, Question two){
                         return Integer.valueOf(two.getID()).compareTo(one.getID());
                     }
                 });
                    QuizBuilder1.DisplayQue(c);
                }
                
                int count=0;
                if(g.size()>0){
                
                 System.out.println("Enter answers for Multiple choice questions");
                 for(int l=0;l<Cn;l++){
                 String answer=in.next();
                ChoiceQuestion e= g.get(l);
                 e.checkAnswer(answer);
                             if( e.checkAnswer(answer)==true){
                        count++;
                    }
                 }}
                else{
                    System.out.println("");
                }
                        
                System.out.println("Enter Answers for Short questions");
               
                 for(int q=0;q<Sn;q++){
                    String answer=in.next();
                    Question v = c.get(q);
                    v.checkAnswer(answer);
                    if( v.checkAnswer(answer)==true){
                        count++;
                    }}
                 System.out.println("");
                 System.out.println("");
                 System.out.println("");
                 System.out.println("");
                 System.out.println("");
                 System.out.println("");
                 System.out.println("");
                 System.out.println("");
                 System.out.println("");
                 System.out.println("");
                 System.out.println("");
                 System.out.println("");
                 System.out.println("");
      
                System.out.println("                              Result");
                System.out.println("");
                System.out.println("                              Raw Score- "+count+"/"+numQ);
                System.out.println("                              Percentage-"+(count*100)/numQ+"%"         );
                 System.out.println("Thank You !!!!");
                 looper=false;
                 
          break;
            case "Q": 
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("Thank You!!!");
                System.exit(0);
            looper=false;
                break;
            default: System.out.println("Invalid Input");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
            looper=true;
            
            break;
        }}
        
        
    }

  
    
        public static void DisplayQuestions(ArrayList<ChoiceQuestion>data){
        for(int x=0;x<data.size();x++){
            System.out.print(x+1+", ");
            data.get(x).DisplayQuest(); 
            
        }}
        public static void DisplayQue(ArrayList<Question>data){
        for(int x=0;x<data.size();x++){
            System.out.print(x+1+", "); 
            data.get(x).DisplayQuest(); 
         }   
        
    
}}
