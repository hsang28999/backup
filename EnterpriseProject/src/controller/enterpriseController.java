/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.enterprise;
import model.EnterpriseModel;
import java.util.Scanner;
import java.sql.SQLException;

/**
 *
 * @author hsang
 */
public class enterpriseController {
    EnterpriseModel model = new EnterpriseModel();
    enterprise etp = new enterprise();
    public String getHome(){
        System.out.println("1.Add enterprise");
        System.out.println("2.Show active enterprise listings");
        System.out.println("3.Find enterprise by tax code");
        System.out.println("4.Exit");
        System.out.println("-----------");
        System.out.println("Please enter your choose:");
        Scanner sc = new Scanner(System.in);
        String pick = sc.nextLine();
        return pick;
    }
    
    public void register(){
        System.out.println("-----------");
        System.out.println("Register enterprise");
        System.out.println("");
        System.out.println("Please enter enterprise name:");
        Scanner sc = new Scanner(System.in);
        String enterpriseName = sc.nextLine();
        this.etp.setEnterpriseName(enterpriseName);
        model.addEnterprise(etp);
    }
    
    public void showList(){
        System.out.println("-----------");
        System.out.println("Enterprise list:");
        model.getList();
        System.out.println("");
        System.out.println("Enter any key to exit:");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
    }
    
    public void search(){
        System.out.println("-----------");
        System.out.println("Please enter enterprise's tax code you want find:");
        Scanner sc = new Scanner(System.in);
        String taxcode = sc.nextLine();
        model.searchEnterprise(taxcode);
        System.out.println("-----------");
        System.out.println("Enter any key to exit:");
        String text = sc.nextLine();
    }
}
