/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Account;
import model.AccountModels;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author hsang
 */
public class AccountController {
    AccountModels customer = new AccountModels();
    private String userName;
    
    public String getHome(){
        System.out.println("1.Login");
        System.out.println("2.Register");
        System.out.println("Choose:");
        Scanner sc = new Scanner(System.in);
        String pick = sc.nextLine();
        return pick;
    }
    
    public boolean login() throws SQLException{
        System.out.println("User Name: ");
        Scanner sc = new Scanner(System.in);
        this.userName = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();
        boolean check = customer.checkLogin(userName, password);
        return check;
    }
    
    public void register() throws SQLException{
        Scanner sc = new Scanner(System.in);
        System.out.println("ID number: ");
        String idNumber = sc.nextLine();
        System.out.println("User Name: ");
        String username = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();
        boolean check = customer.addAccount(username, password,idNumber); 
        if(check){
            System.out.println("Success");
        }else{
            System.out.println("Error!");
        }
    }
    
    public String getMenu(){
        System.out.println("1.Check account infomation");
        System.out.println("2.Withdrawal");
        System.out.println("3.Deposit");
        Scanner sc = new Scanner(System.in);
        String pick = sc.nextLine();
        return pick;
    }
    
    public void getInfo() throws SQLException{
        customer.getAccount(this.userName);
        Scanner sc = new Scanner(System.in);
        String scanner = sc.nextLine();
        
    }
    
    public void getMoney() throws SQLException{
        Scanner sc = new Scanner(System.in);
        System.out.println("How much would you like to withdrawal?");
        int money = sc.nextInt();
        if(customer.getMon(userName, money)){
            System.out.println("Success");
            String scan = sc.nextLine();
        }else {
            System.out.println("Error");
        }
    }
    
    public void addMoney() throws SQLException{
        Scanner sc = new Scanner(System.in);
        System.out.println("How much would you like to deposit?");
        int money = sc.nextInt();
        if(customer.addMon(userName, money)){
            System.out.println("Success");
            String scan = sc.nextLine();
        }else{
            System.out.println("Error");
        }
    }
}
