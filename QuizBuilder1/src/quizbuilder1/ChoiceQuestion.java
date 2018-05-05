
package quizbuilder1;

import java.util.ArrayList;

//Class that extends from another Question class 

public class ChoiceQuestion extends Question {
    
   private ArrayList<String> choices;
   private boolean right;
   private int ID;
  
   public ChoiceQuestion(){
       
      
      
       choices=new ArrayList<String>();
       
   }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    //method that allows the user to add different options to make a quiz
    public void addChoice(String Choice){
        choices.add(Choice);
        }
    
    //method to display all the questions
    public void DisplayQuest(){
        super.DisplayQuest();
        
        for(int i=0; i<choices.size();i++){
            int num=i+1;
            System.out.println(num+":"+choices.get(i));
        
    }
    }
    
    
    // validates the inut entered by the user
    public void setRight(String num,boolean right){
         if(right==true){
            
            setAnswer(num);
        }
        
    }
}
