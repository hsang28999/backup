/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Account;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author hsang
 */
public class AccountModels {
    public boolean checkLogin(String userName, String password) throws SQLException{
         
        Connection cnn = 
            DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_bank?useUnicode=true&characterEncoding=UTF-8","root","");
        Statement stt = cnn.createStatement();
        ResultSet rs = stt.executeQuery("SELECT * FROM account WHERE userName='"+userName+"' AND password='"+password+"'");
        if(rs.next()){
            return true;
        }else{
            return false;
        }
    }
    
    public void getAccount(String userName) throws SQLException{
        Connection cnn = 
                DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_bank?useUnicode=true&characterEncoding=UTF-8","root","");
        Statement stt = cnn.createStatement();
        ResultSet rs = stt.executeQuery("SELECT * FROM account WHERE userName='"+userName+"'");
        while(rs.next()){
            System.out.println("-----");
            System.out.println("Account Number: "+rs.getString("accountNumber"));
            System.out.println("User Name: "+rs.getString("userName"));
            System.out.println("Balance: "+rs.getInt("balance"));
        }
    }
    
    public boolean addAccount(String userName,String password,String accountNumber) throws SQLException{
        Connection cnn = 
                DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_bank?useUnicode=true&characterEncoding=UTF-8","root","");
        Statement stt = cnn.createStatement();
        try{
            stt.execute("INSERT INTO account(accountNumber,userName,password,balance,createdAt,status) "
                    + "VALUES ('"+accountNumber+"','"+userName+"','"+password+"',0,0,1)");
            return true;
        }catch(ArithmeticException e){
            System.out.println(e);
            return false;
        }
    }
    
    public boolean getMon(String userName, int money) throws SQLException{
        Connection cnn = 
                DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_bank?useUnicode=true&characterEncoding=UTF-8","root","");
        Statement stt = cnn.createStatement();
        ResultSet rs = stt.executeQuery("SELECT * FROM account WHERE userName='"+userName+"'");
        int balance =0;
        while(rs.next()){
            balance = rs.getInt("balance");
            if(money>balance){
                return false;
            }else{
                balance -= money;
            }
            stt.execute("UPDATE account SET balance = "+balance+" WHERE userName = '"+userName+"'");
            return true;
        }
        return false;
    }
    
    public boolean addMon(String userName, int money) throws SQLException{
        Connection cnn = 
                DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_bank?useUnicode=true&characterEncoding=UTF-8","root","");
        Statement stt = cnn.createStatement();
        ResultSet rs = stt.executeQuery("SELECT * FROM account WHERE userName='"+userName+"'");
        int balance = 0;
        while(rs.next()){
            balance = rs.getInt("balance");
            balance += money;
            stt.execute("UPDATE account SET balance = "+balance+" WHERE userName = '"+userName+"'");
            return true;
        }
        return false;
    }
}

