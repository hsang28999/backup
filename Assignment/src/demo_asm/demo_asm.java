/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_asm;

import controller.BookController;
/**
 *
 * @author hsang
 */
public class demo_asm {
    public static void main(String[] args) {
        BookController ctrl = new BookController();
        while(true){
            boolean menu=true;
            switch(ctrl.getHome()){
                case"1":
                    while(menu){
                        switch(ctrl.listBook()){
                            case 0:
                                menu=false;
                                break;
                            default:
                                boolean detail = true;
                                while(detail){
                                    switch(ctrl.BookDetail()){
                                        case"1":
                                            ctrl.getEdit();
                                            break;
                                        case"2":
                                            ctrl.getDelete();
                                            detail=false;
                                            break;
                                        case"3":
                                            detail=false;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            break;
                        }
                    }
                    break;
                case"2":
                    ctrl.addBook();
                    break;
                case"3":
                    boolean menuSearch=true;
                    while(menuSearch){
                        switch(ctrl.searchBook()){
                            case 0:
                                menuSearch=false;
                                break;
                            default:
                                boolean detail = true;
                                while(detail){
                                    switch(ctrl.BookDetail()){
                                        case"1":
                                            ctrl.getEdit();
                                            break;
                                        case"2":
                                            ctrl.getDelete();
                                            detail=false;
                                            break;
                                        case"3":
                                            detail=false;
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
