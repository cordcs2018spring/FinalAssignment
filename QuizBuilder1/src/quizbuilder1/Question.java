
package quizbuilder1;

import java.util.ArrayList;



public class Question implements iQuizBuilder {
    private int ID;
 private String text="";
    private String answer="";
    private int MaxQuest=0;

    
    public Question(){
   
}

    // Setters and getters
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
    public int getID() {
        return ID;
    
    }
  

    public int getMaxQuest() {
        return MaxQuest;
    }

    public void setMaxQuest(int MaxQuest) {
        this.MaxQuest = MaxQuest;
    }
       
       
 


    public String getText() {
        return text;
    }

    public void settext(String question) {
        this.text= question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String rightAnswer) {
        this.answer = rightAnswer;
    }
    @Override
    
    //boolean that checks to match the answer entered by the user and the QuizMaker
    public boolean checkAnswer(String resp){
        return resp.equals(answer);
         
    }
    @Override
    
    //Displays all the question in Question Answer format
    public void DisplayQuest(){
        System.out.println(text);
    }




}

   
