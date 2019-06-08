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
    
    
    
    
    public Test() {
    }

    @Override
    public boolean addQuestion(IQuestion iq) throws TestException {
       return question;
    }

    @Override
    public IQuestion getQuestion(int i) throws TestException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeQuestion(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeQuestion(IQuestion iq) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int numberQuestions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isComplete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ITestStatistics getTestStatistics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean loadFromJSONFile(String string) throws TestException {
     return true;
    }
    
}
