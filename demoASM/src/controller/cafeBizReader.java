/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.cafeBizModel;
import entity.article;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author hsang
 */
public class cafeBizReader {
    ArrayList<article> articleArray = new ArrayList<>();
    cafeBizModel model = new cafeBizModel();
    HashSet<String> articleHash = new HashSet<>();
    HashSet<String> articleHash2 = new HashSet<>();
    
    public void addArticle(String url,int mode) throws IOException{
        Document doc = Jsoup.connect(url).get();
        Elements newsHeadlines = doc.select("#ulTinMoi li a");
        for (Element headline : newsHeadlines) { 
            if(mode==1){
                articleHash.add(checkUrl(headline.attr("href")));
            }
            else if(mode==2){
                articleHash2.add(checkUrl(headline.attr("href")));
            }   
        }
        doc.select(".fr ul li a");
        for (Element headline : newsHeadlines) { 
//                article atc = new article();
//                atc.setStatus(0);
//                atc.setTitle(headline.attr("title"));
//                atc.setUrl(checkUrl(headline.attr("href")));
//                atc.setContent("");
//                articleHash.add(atc.getUrl());
            if(mode==1){
                articleHash.add(checkUrl(headline.attr("href")));
            }
            else if(mode==2){
                articleHash2.add(checkUrl(headline.attr("href")));
            }  
        }
        doc.select(".moicapnhat ul li a");
        for (Element headline : newsHeadlines) { 
             if(mode==1){
                articleHash.add(checkUrl(headline.attr("href")));
             }
             else if(mode==2){
                articleHash2.add(checkUrl(headline.attr("href")));
             }  
        }
    }
    
    public void getIndexArticle() throws SQLException{        
        try {
            addArticle("http://cafebiz.vn/chuyen-cua-3-con-ca-doc-va-ngam-nhieu-nguoi-trong-chung-ta-se-thay-ngam-ngui-20180412162344398.chn",1);
        } catch (Exception ex) {
        }
//        for(article atc : articleHash){
//          if(articleHash.size()==100) break;
//            addArticle(atc.getUrl());
//        }
        while(true){
             articleHash2=articleHash;
             for(String atc : articleHash){
     //            model.addArticle(atc);
                try{
                    addArticle(atc,2);
                }catch(Exception e){
                    
                }
                 System.out.println(articleHash2.size());
                if(articleHash2.size()>100){
                     break;
                }
             }
             if(articleHash2.size()>100){
                     break;
             }
             articleHash=articleHash2;
             for(String atc : articleHash2){
                 try {
                     //            model.addArticle(atc);
                     addArticle(atc,1);
                 } catch (IOException ex) {
                 }
                 System.out.println(articleHash.size());
                if(articleHash.size()>100){
                    break;
                }
             }
             if(articleHash.size()>100){
                     break;
             }
        }
//        System.out.println(articleHash.size());
//        articleArray = model.getArticle();
//        for(int i=0;i<articleArray.size();i++){
//            System.out.println(i+1+"."+articleArray.get(i).getTitle());
//        }
    }
    public String checkUrl(String url){
        try {
            URL link = new URL(url);
            link.getHost();
            return url;
        } catch (MalformedURLException ex) {
            String link = "http://cafebiz.vn"+url;
            return link;
        }
    }
}
