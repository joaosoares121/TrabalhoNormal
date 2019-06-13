/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhonormal;

import interfaces.exceptions.QuestionException;
import interfaces.models.IQuestionMetadata;

/**
 *
 * @author joaosoares
 */
public class Question implements interfaces.models.IQuestion{

    private String title;
    private String question_descripton;
    private QuestionMetaData question_metadata;
    private boolean done;
    private String user_answer;
    private boolean correct_answer;

    
    
    
    //Titulo da Pergunta
    @Override
    public String getTitle() {
       return title;
    }

    @Override
    public void setTitle(String string) throws QuestionException {
        this.title = string;
    }

    @Override
    public String getQuestion_description() {
        return question_descripton;
    }

    @Override
    public void setQuestion_description(String string) throws QuestionException {
        this.question_descripton = string;
    }

    @Override
    public IQuestionMetadata getQuestion_metadata() {
        return question_metadata;
    }

    @Override
    public void setQuestion_metadata(IQuestionMetadata iqm) {
        this.question_metadata = (QuestionMetaData) iqm;
    }

    @Override
    public boolean isDone() {
            
        if(true == isDone()){
            return true;
        }else{
            return false;
        }
        
        
    }

    @Override
    public void setDone(boolean bln) {
        this.done = bln;
    }

    @Override
    public void answer(String string) {
        this.user_answer = string;
    }

    @Override
    public boolean evaluateAnswer() {
       
        // return correct_answer;
       
        if (this.correct_answer != true){
            System.out.println("ERRADA");
            
        } else{
            System.out.println("CORRETA");
        }
        return correct_answer;
    }

    @Override
    public String toString() {
        return "Question{" + "title=" + title + ", question_descripton=" + question_descripton + ", question_metadata=" + question_metadata + ", done=" + done + ", user_answer=" + user_answer + ", correct_answer=" + correct_answer + '}';
    }
    
   
    
}
