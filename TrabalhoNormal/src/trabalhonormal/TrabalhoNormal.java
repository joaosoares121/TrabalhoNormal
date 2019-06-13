/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhonormal;

import interfaces.controller.ITest;
import interfaces.exceptions.TestException;
import views.TestWindow;

/**
 *
 * @author joaosoares
 */
public class TrabalhoNormal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TestException {
     
        System.out.println("Inicio Teste!");
        
        String path ="/Users/joaosoares/NetBeansProjects/TrabalhoNormal/TrabalhoNormal/src/data/teste_A.json";
        
        
        ITest demoTest = new Test(path);
        //demoTest.loadFromJSONFile("../data/teste_A.json");
        demoTest.loadFromJSONFile(path);
        
        TestWindow t = new TestWindow();
        t.startTest(demoTest);
        
        System.out.println("Teste Efetuado");
        System.out.println();
        System.out.println(demoTest.toString());
        
        
    }
    
}
