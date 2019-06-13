/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalhonormal;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 *
 * @author joaosoares
 */
public class testeJson {
 static String json = "["
         + "{\n" +
"  \"type\" : \"MultipleChoice\",\n" +
"      \"question\": {\n" +
"    \n" +
"    \"title\" : \"Question 1\",\n" +
"    \"question_description\" : \"The ability of an object to take on many forms is:\",\n" +
"    \"options\": [\n" +
"                \"Polymorphism\",\n" +
"                \"Encapsulation\",\n" +
"                \"Design Patter\",\n" +
"                \"Does not Exist\"\n" +
"            ],\n" +
"            \"correct_answer\": \"Polymorphism\"\n" +
"    \n" +
"    }\n" +
"  \n" +
",\n" +
"  \"type\" : \"MultipleChoice\",\n" +
"      \"question\": {\n" +
"    \n" +
"    \"title\" : \"Question 2\",\n" +
"    \"question_description\" : \"The ability of an object to take on many forms is:\",\n" +
"    \"options\": [\n" +
"                \"Polymorphism\",\n" +
"                \"Encapsulation\",\n" +
"                \"Design Patter\",\n" +
"                \"Does not Exist\"\n" +
"            ],\n" +
"            \"correct_answer\": \"Polymorphism\"\n" +
"    \n" +
"    }\n" +
"    ,\n" +
"  \"type\" : \"MultipleChoice\",\n" +
"      \"question\": {\n" +
"    \n" +
"    \"title\" : \"Question 3\",\n" +
"    \"question_description\" : \"The ability of an object to take on many forms is:\",\n" +
"    \"options\": [\n" +
"                \"Polymorphism\",\n" +
"                \"Encapsulation\",\n" +
"                \"Design Patter\",\n" +
"                \"Does not Exist\"\n" +
"            ],\n" +
"            \"correct_answer\": \"Polymorphism\"\n" +
"    \n" +
"    }\n" +
"}\n]" +
"";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();

        String pageName = jsonObject.getAsJsonObject("question").get("title").getAsString();
        System.out.println(pageName);

        JsonArray arr = jsonObject.getAsJsonArray("options");
        for (int i = 0; i < arr.size(); i++) {
           
            String post_id = arr.get(i).getAsJsonObject().get("options").getAsString();
            
            System.out.println(post_id);
        
        }
    }
    
}






