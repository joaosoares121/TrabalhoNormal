/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhonormal;

import interfaces.controller.ITest;
import interfaces.controller.ITestStatistics;
import interfaces.exceptions.TestException;
import interfaces.models.IQuestion;

/**
 *
 * @author joaosoares
 */
public class Test implements ITest{
    
        
    private boolean question;
    private Question questionclasse;
    //private boolean remove_question;
    //private boolena 
    private boolean complete;
    private boolean loadjson;
    private ITestStatistics statistics;
    private String path;
    private Object objects[];
    
    
    
    public Test() {
    }

    @Override
    public boolean addQuestion(IQuestion iq) throws TestException {
       //return question;
    
        int tam = 100;

        if (tam == this.objects.length){
            return false;

        }else{

            this.objects[tam] = new Object();
            return true;
        }
    
    
    
    
    }
    

    @Override
    public IQuestion getQuestion(int i) throws TestException {
        
        return questionclasse;
    }

    @Override
    public boolean removeQuestion(int i) {
        return removeQuestion(questionclasse);
    }

    @Override
    public boolean removeQuestion(IQuestion iq) {
       return removeQuestion(iq);
    }

    @Override
    public int numberQuestions() {
        return 3;
    }

    @Override
    public boolean isComplete() {
        return true;
    }

    @Override
    public ITestStatistics getTestStatistics() {
        return statistics;
    }

    @Override
    public boolean loadFromJSONFile(String string) throws TestException {
     return true;
    }
    
}
