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
public class QuestionYesNo extends Question implements interfaces.models.IQuestionYesNo{

    private String getCorrect_answer;
    private String getUser_answer;

    public String getGetCorrect_answer() {
        return getCorrect_answer;
    }

    public void setGetCorrect_answer(String getCorrect_answer) {
        this.getCorrect_answer = getCorrect_answer;
    }

    public String getGetUser_answer() {
        return getUser_answer;
    }

    public void setGetUser_answer(String getUser_answer) {
        this.getUser_answer = getUser_answer;
    }

    @Override
    public String getCorrect_answer() {
       return getCorrect_answer;
    }

    @Override
    public void setCorrect_answer(String string) {
        this.setGetCorrect_answer(getCorrect_answer);
    }

    @Override
    public String getUser_answer() {
        return getUser_answer;
    }

    @Override
    public void setUser_answer(String string) {
        this.setGetUser_answer(getUser_answer);
    }
    
    
}
