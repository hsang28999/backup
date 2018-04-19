/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.enterprise;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author hsang
 */
public class EnterpriseModel {
    public void addEnterprise(enterprise etp){
        try {
            java.util.Date day = new java.util.Date(etp.getCreatedAt());
            java.sql.Date sqlDate = new java.sql.Date(day.getTime());
            Connection cnn;
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydoanhnghiep?useUnicode=true&characterEncoding=UTF-8","root","");
            String sql = "insert into doanhnghiep (Id,enterpriseName,taxcode,createdAt,status) values(?,?,?,?,?)";
            PreparedStatement ps= cnn.prepareStatement(sql);
            ps.setInt(1,etp.getId());
            ps.setString(2, etp.getEnterpriseName());
            ps.setString(3, etp.getTaxCode());
            ps.setDate(4, sqlDate);
            ps.setInt(5, etp.getStatus());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EnterpriseModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error");
        }
    }
    public void getList(){
        try {
            Connection cnn =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydoanhnghiep?useUnicode=true&characterEncoding=UTF-8","root","");
            Statement stt = cnn.createStatement();
            String sql = "SELECT * FROM doanhnghiep WHERE status=1";
            ResultSet rs = stt.executeQuery(sql);
            writeResultSet(rs);
        } catch (SQLException ex) {
            Logger.getLogger(EnterpriseModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void writeResultSet(ResultSet resultSet) throws SQLException {
        int i=1;
        while (resultSet.next()) {
            String enterpriseName = resultSet.getString("enterpriseName");
            int Id = resultSet.getInt("Id");
            String taxcode = resultSet.getString("taxcode");
            Date createdAt = resultSet.getDate("createdAt");
            int status = resultSet.getInt("status");
            String active;
            if(status==1){
                active="active";
            }else{
                active="not active";
            }
            if(enterpriseName==null || "".equals(enterpriseName)){
                System.out.println("Not found");
            }else{
                System.out.println("---------------");
                System.out.println(i+".");
                System.out.println("Id: " + Id);
                System.out.println("Enterprise Name: " + enterpriseName);
                System.out.println("Taxcode: " + taxcode);
                System.out.println("Created At: " + createdAt);
                System.out.println("Status: " + active);
                i++;
            }
        }
    }
    
    public void searchEnterprise(String taxcode){
        try {
            Connection cnn =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlydoanhnghiep?useUnicode=true&characterEncoding=UTF-8","root","");
            String sql = "SELECT * FROM doanhnghiep WHERE taxcode = ? AND status=1";
            PreparedStatement ps= cnn.prepareStatement(sql);
            ps.setString(1,taxcode);
            ResultSet rs = ps.executeQuery();
            writeResultSet(rs);
        } catch (SQLException ex) {
            Logger.getLogger(EnterpriseModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
