/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Poliquit_Task1;

/**
 *
 * @author 3rd Year Account
 */
public class Task1Demo {
    public static void main(String[] args){
    OuterClass oc = new OuterClass();
    InnerClass ic = new InnerClass();
    
    System.out.println(oc.data);
    System.out.println(ic.data2);
    ic.method(oc);
    }
}

