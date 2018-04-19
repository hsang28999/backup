/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import controller.Controller;

/**
 *
 * @author hsang
 */
public class demo {
    public static void main(String[] args) {
        Controller ctrl = new Controller();
        boolean main = true;
        while(main){
            switch(ctrl.home()){
                case 1:
                    ctrl.addAuthor();
                    break;
                case 2:
                    ctrl.addNxb();
                    break;
                case 3:
                    ctrl.addBook();
                    break;
                case 4:
                    ctrl.showAuthor();
                    break;
                case 5:
                    ctrl.showNxb();
                    break;
                case 6:
                    ctrl.showBook();
                    break;
                case 7:
                    ctrl.search();
                    break;
                case 8:
                    ctrl.saveFile();
                    break;
                case 9:
                    ctrl.openFile();
                    break;
                case 10:
                    main = false;
                    break;
                default:
                    break;
            }
        }
    }
}
