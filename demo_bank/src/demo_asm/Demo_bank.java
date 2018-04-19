/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_asm;
import model.AccountModels;
import java.sql.SQLException;
import controller.AccountController;
/**
 *
 * @author hsang
 */
public class Demo_bank {
    public static void main(String[] args) throws SQLException{
        AccountModels model = new AccountModels();
        AccountController ctrl = new AccountController();
        
        while(true){
            boolean menu = true;
            switch(ctrl.getHome()){
                case"1": 
                    if(ctrl.login()){
                        while(menu){
                            switch(ctrl.getMenu()){
                                case"1":
                                    ctrl.getInfo();
                                    break;
                                case"2":
                                    ctrl.getMoney();
                                    break;
                                case"3":
                                    ctrl.addMoney();
                                    break;
                                default:
                                    menu=false;
                                    break;
                            }
                        }
                    }
                    break;
                case"2":
                    ctrl.register();
                    break;
                default:
                    System.out.println("Error choose");
                    break;
            }
        }
    }
}
