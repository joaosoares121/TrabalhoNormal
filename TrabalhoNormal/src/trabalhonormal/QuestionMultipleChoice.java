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
public class QuestionMultipleChoice implements interfaces.models.IQuestionMultipleChoice{

   
    public String[] getSetoptions() {
        return getSetoptions();
    }

    public void setSetoptions(String[] setoptions) {
        this.setSetoptions(setoptions);
    }
    
    
    @Override
    public String[] getOptions() {
       return getOptions();
    }

    @Override
    public void setOptions(String[] strings) {
        this.setOptions(strings);
    }

    @Override
    public String getCorrect_answer() {
        return getCorrect_answer();
    }

    @Override
    public void setCorrect_answer(String string) {
        this.setCorrect_answer(string);
    }

    @Override
    public String getUser_answer() {
        return getUser_answer();
    }

    @Override
    public void setUser_answer(String string) {
        this.setUser_answer(string);
    }

    @Override
       public String getTitle() {
           return  getTitle();
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
        this.setDone(bln);
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
