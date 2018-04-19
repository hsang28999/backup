/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread;

/**
 *
 * @author hsang
 */
public class DemoThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        firstThread t1 = new firstThread();
        secondThread t2 = new secondThread();
        
        t1.start();
        t2.start();
    }
    
}
