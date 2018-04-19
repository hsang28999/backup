/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hsang
 */
public class Controller<E> {
    List<E> elelist = new ArrayList<>();
    
    public void addElement(E e){
        elelist.add(e);
        System.out.println(e.toString());
    }
    public E getElement(int index){
        System.out.println(elelist.get(index).toString());
        return elelist.get(index);
    }
}
