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
public class QuestionNumeric implements interfaces.models.IQuestionNumeric{

        
    @Override
    public double getCorrect_anwser() {
        return getCorrect_anwser();
    }

    @Override
    public void setCorrect_anwser(double d) {
        this.setCorrect_anwser(d);
    }

    @Override
    public double getUser_answer() {
        return getUser_answer();
    }

    @Override
    public void setUser_answer(double d) {
        this.setUser_answer(d);
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
