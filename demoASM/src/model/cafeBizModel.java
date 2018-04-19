/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.cafeBizReader;
import entity.article;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hsang
 */
public class cafeBizModel {
    ArrayList<article> articleArray = new ArrayList<>();

    public void addArticle(article atc){
        try {
            Connection cnn =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/cafebiz?useUnicode=true&characterEncoding=UTF-8","root","");
            String sql = "insert into article(title,url,content,status) values (?,?,?,?)";
            PreparedStatement ps= cnn.prepareStatement(sql);
            ps.setString(1,atc.getTitle());
            ps.setString(2,atc.getUrl());
            ps.setString(3,atc.getContent());
            ps.setInt(4,atc.getStatus());
            ps.execute();
        } catch (SQLException ex) {
        }
    }
    public ArrayList getArticle(){
        ArrayList<article> articleArray = new ArrayList<>();
        try {
            Connection cnn =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/cafebiz?useUnicode=true&characterEncoding=UTF-8","root","");
            Statement stt = cnn.createStatement();
            String sql = "SELECT * FROM article WHERE status=0";
            ResultSet rs = stt.executeQuery(sql);
            return writeResultSet(rs);
        } catch (SQLException ex) {
            return articleArray;
        }
    }
    
    private ArrayList writeResultSet(ResultSet resultSet) throws SQLException {
        
        while (resultSet.next()) {
            article atc = new article();
            String title = resultSet.getString("title");
            String content = resultSet.getString("content");
            String url = resultSet.getString("url");
            int status = resultSet.getInt("status");
            atc.setContent(content);
            atc.setStatus(status);
            atc.setUrl(url);
            atc.setTitle(title);
            articleArray.add(atc);
        }        
        return articleArray;
    }

}
