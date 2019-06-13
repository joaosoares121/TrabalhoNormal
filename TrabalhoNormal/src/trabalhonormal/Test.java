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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//import jdk.nashorn.internal.parser.JSONParser;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author joaosoares
 */
public class Test implements ITest {

    private boolean question;
    private Question questionclasse;
    //private boolean remove_question;
    //private boolena 
    private boolean complete;
    private boolean loadjson;
    private ITestStatistics statistics;
    private String path;
    private String options[];
    
    //Array de Objectos do tipo Question
    private Question[] objects = new Question[5];
    private int i;

    public Test(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    

    @Override
    public boolean addQuestion(IQuestion iq) throws TestException {
        //return question;
        
       
        
        int tam = 100;

        if (tam == this.objects.length) {
            return false;

        } else {

            this.objects[tam] = (Question) new Object();
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
        
        File f = new File(this.path);
        
        if (f.exists()) {
                try {
                    

                    JSONParser parser = new JSONParser();

                    JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(this.path));

                    for (Object o : jsonArray) {
                   
                        
                        //JSONObject questionob = (JSONObject) o;

                        //JSONArray questionDetails = (JSONArray) questionob.get("type");

                            JSONObject questionDetails = (JSONObject) o;

                            String type = (String) questionDetails.get("type");
                            System.out.println("Type: " + type);
                            
                            
                            //JSONObject questiondet = (JSONObject) o;
                            
                            //JSONObject questionDetails = (JSONObject) questiondet.get("question");

                            
                            
                            JSONObject questionn = (JSONObject) questionDetails.get("question");
                            
                            String title = (String) questionn.get("title");
                            
                            System.out.println("Title: " + title);
                            
                            String question_description = (String) questionn.get("question_description");
                            
                            System.out.println("Question Description: " + question_description);
                            
                           // JSONArray options = (JSONArray) questionDetails.get("options");
                            
                           
                            
                            
                            JSONArray optionsArray = (JSONArray) questionDetails.get("options");
                            //this.options = new String[options.size()];
                            
                           // for (int i = 0; i<options.size();i++) {
                            //   System.out.println("options: " + this.options[i]);
                           // }
                    
                           
                           
                          // Iterator iarray = optionsArray.iterator();
 
                            //while (iarray.hasNext()) {

                              //  System.out.println(" "+iarray.next());

                            //}
                            
                            
                            String correct_answer = (String) questionn.get("correct_answer");
                            
                            System.out.println("Correct Answer: " + correct_answer);
                            
                            System.out.println("---------**********--------");
                            
                            
                            
                            
                       
                    }

                     return this.question;

                } catch (ParseException ex) {
                   
                } catch (FileNotFoundException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
               
            }
            return false;

        //http://codingwithcake.com/java/how-to-parse-a-json-file-using-gson/
        //https://java2blog.com/gson-example-read-and-write-json/
        
        
        
    }

   
}
