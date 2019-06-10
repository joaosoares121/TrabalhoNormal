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
public class QuestionYesNo implements interfaces.models.IQuestionYesNo{

    
    private String correct_Answer;
    private String user_answer;
    
    
    
    public String getCorrect_Answer() {    
        return correct_Answer;
    }

    //private String title;
    //private String question_description;
    public void setCorrect_Answer(String correct_Answer) {
        this.correct_Answer = correct_Answer;
    }

    @Override
    public String getCorrect_answer() {
        return correct_Answer;
    }

    @Override
    public void setCorrect_answer(String string) {
        this.correct_Answer= string;
    }

    @Override
    public String getUser_answer() {
       return user_answer;
    }
    
    @Override
    public void setUser_answer (String user_answer){
        this.user_answer = user_answer;
    }

    @Override
    public String getTitle() {
        return getTitle();
    }

    @Override
    public void setTitle(String string) throws QuestionException {
        this.setTitle(string);
    }

    @Override
    public String getQuestion_description() {
        return getQuestion_description();
    }

    @Override
    public void setQuestion_description(String string) throws QuestionException {
        this.setQuestion_description(string);
    }

    @Override
    public IQuestionMetadata getQuestion_metadata() {
        return getQuestion_metadata();
    }

    @Override
    public void setQuestion_metadata(IQuestionMetadata iqm) {
        this.setQuestion_metadata(iqm);
    }

    @Override
    public boolean isDone() {
        return isDone();
    }

    @Override
    public void setDone(boolean bln) {
        this.isDone();
    }

    @Override
    public void answer(String string) {
       this.answer(string);
    }

    @Override
    public boolean evaluateAnswer() {
        return evaluateAnswer();
    }
    
}
