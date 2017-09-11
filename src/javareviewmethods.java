/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class javareviewmethods {
    //void=return type: not expecting any in return
    //method needs to be unique but needs to have parameters in order to use same method name
    public void helloWorld(){
        System.out.println("Hello world");
    }
    //overloading method can use same name but with changed parameters
    public void helloWorld(String name){
        System.out.println("Hello world "+name);
    }
    
    public static void main(String[] args) {
       //create an object to run methods
        javareviewmethods test = new javareviewmethods();
        test.helloWorld();
        test.helloWorld("Nia");
    }
}
