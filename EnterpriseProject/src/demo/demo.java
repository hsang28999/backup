/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import controller.enterpriseController;
import entity.enterprise;
import model.EnterpriseModel;
/**
 *
 * @author hsang
 */
public class demo {
    public static void main(String[] args) {
        enterpriseController ctrl = new enterpriseController();
        EnterpriseModel model = new EnterpriseModel();
        boolean status = true;
        while(status){
            switch(ctrl.getHome()){
                case"1":
                    ctrl.register();
                    break;
                case"2":
                    ctrl.showList();
                    break;
                case"3":
                    ctrl.search();
                    break;
                case"4":
                    status=false;
                    break;
            }
        }
    }
}
