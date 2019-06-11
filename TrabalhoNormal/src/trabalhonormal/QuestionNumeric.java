/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhonormal;


/**
 *
 * @author joaosoares
 */
public class QuestionNumeric extends Question implements interfaces.models.IQuestionNumeric{

        private double getCorrect_answer;
        private double getUser_answer;

    public double getGetCorrect_answer() {
        return getCorrect_answer;
    }

    public void setGetCorrect_answer(double getCorrect_answer) {
        this.getCorrect_answer = getCorrect_answer;
    }

    public double getGetUser_answer() {
        return getUser_answer;
    }

    public void setGetUser_answer(double getUser_answer) {
        this.getUser_answer = getUser_answer;
    }

    @Override
    public double getCorrect_anwser() {
        return getCorrect_answer;
    }

    @Override
    public void setCorrect_anwser(double d) {
        this.setGetCorrect_answer(getCorrect_answer);
    }

    @Override
    public double getUser_answer() {
       return getUser_answer;
    }

    @Override
    public void setUser_answer(double d) {
       this.setGetUser_answer(getUser_answer);
    }
        
    
    
    
}
