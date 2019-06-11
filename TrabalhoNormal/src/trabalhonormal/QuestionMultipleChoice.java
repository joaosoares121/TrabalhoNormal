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
public class QuestionMultipleChoice extends Question implements interfaces.models.IQuestionMultipleChoice{

        private String[] getOptions;
        private String getCorrect_answer;
        private String getUser_answer;

    public String[] getGetOptions() {
        return getOptions;
    }

    public void setGetOptions(String[] getOptions) {
        this.getOptions = getOptions;
    }

    public String getGetCorrect_answer() {
        return getCorrect_answer;
    }

    public void setGetCorrect_answer(String getCorrect_answer) {
        this.getCorrect_answer = getCorrect_answer;
    }

    public String getGetUser() {
        return getUser_answer;
    }

    public void setGetUser(String getUser) {
        this.getUser_answer = getUser;
    }

    @Override
    public String[] getOptions() {
       return getOptions;
    }

    @Override
    public void setOptions(String[] strings) {
        this.getOptions = strings;
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
        this.setGetCorrect_answer(getCorrect_answer);
    }
    
    
}


