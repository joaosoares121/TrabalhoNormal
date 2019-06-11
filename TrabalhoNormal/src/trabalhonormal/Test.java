/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhonormal;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import interfaces.controller.ITest;
import interfaces.controller.ITestStatistics;
import interfaces.exceptions.TestException;
import interfaces.models.IQuestion;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    //Array de Objectos do tipo Question
    private Question[] objects = new Question[5];
private int i;
    public Test() {
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

        //http://codingwithcake.com/java/how-to-parse-a-json-file-using-gson/
        //https://java2blog.com/gson-example-read-and-write-json/
        
        Gson gson = new Gson();
        File jsonFile = Paths.get("../data/teste_A.json").toFile();
        JsonObject jsonObject = null;
        try {
            jsonObject = gson.fromJson(new FileReader(jsonFile), JsonObject.class);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }

        String type = jsonObject.get("type").getAsString();

        JsonObject question = jsonObject.getAsJsonObject("question");
        String title = jsonObject.get("title").getAsString();
        String question_description = question.get("question_description").getAsString();
        
        System.out.println("title = " + type);
        System.out.println("question = " + question);
        System.out.println("question_description" + question_description);

        JsonArray optionsArray = jsonObject.getAsJsonArray("options");
        for (JsonElement option : optionsArray) {
            System.out.println("option = " + option.getAsString());
        }
        
        String correct_answer = jsonObject.get("correct_answer").getAsString();
        
        

        return true;
    }

}
