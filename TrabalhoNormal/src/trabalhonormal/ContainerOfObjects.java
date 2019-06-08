/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp08;

import java.util.Arrays;
//import java.util.Comparator;

/**
 *
 * @author Tiago Pinto
 */
public class ContainerOfObjects {
    
    private final int DEFAULT_SIZE = 100;
    private Object objects[] = {1,2,5};

    
    
    /**
     * Construtor que permite a instanciação da classe tendo por
     * base um vetor de elementos recebido
     * 
     * @param objects Lista de objetos sem tamanho fixo 
     */
    public ContainerOfObjects(Object[] objects) {
        this.objects = objects;
    }

    
    /**
     * Construtor que permite a instanciação da classe tendo por base um valor por defeito (100)
     */
    public ContainerOfObjects() {
        
        this.objects = new Object[DEFAULT_SIZE];
    }
    
    
    /**
     * Construtor que permite a instanciação da classe definindo 
     * um valor máximo de elementos
     * 
     * @param maxSize número máximo de elementos permitidos no vetor 
     */
    public ContainerOfObjects(int maxSize){
        
        this.objects = new Object[maxSize];
    }
    
    /**
     * Método responsável por inserir um {@link Object objeto} na coleção de
     * {@link ContainerOfObjects#objects objetos}
     * @param newObject
     * @return 
     */
    public boolean addObject(Object newObject){
        
        int tam = this.size();

        if (tam == this.objects.length){
            return false;

        }else{

            this.objects[tam] = new Object();
            return true;
        }
    }
    
    public Object removeObject(int position) {

        int size = objects.length;

        Object elemDel = 5;

        for (position = 0; position < size; position++) {

            if (objects[position] == elemDel) {
                
                Arrays.toString(objects);
            }
        }

        return true;
    }
    
    public boolean setObject(int position, Object newObject) {

        return false;
    }

    public int findObject(Object obj) {

        for (int i = 0; i<this.size(); i++) {

            if (this.objects[i].equals(obj)) {

                return i;
            }
        }

        return -1;
    }
    
    
//    public void sort(){
//        for(int i=0; i<size();i++){
//            for(int j=0;j<size()-1-i;j++){
//                
//                if(((Comparator)this.getObject(j).compareTo((Comparator)this.getObject(j+1))<(1)){
//                    //decrescente
//                    Object aux = this.objects;
//                    this.objects[j]=this.objects[j+1];
//                    this.objects[j+1] = aux;
//                }
//            }
//        }
//    }

    
    @Override
    public String toString() {
        return "ContainerOfObjects{" + "DEFAULT_SIZE=" + DEFAULT_SIZE + ", objects=" + objects + '}';
    }
    
    private int size() {
        return size();
    }
    
    
    private Object getObject(int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
