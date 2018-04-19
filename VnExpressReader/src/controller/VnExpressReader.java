/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Article;
import entity.Category;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author hsang
 */
public class VnExpressReader implements Reader{

    ArrayList<Article> articleArr = new ArrayList<>();
    ArrayList<Category> categoryArr = new ArrayList<>();
    
    @Override
    public void getIndexArticles() throws IOException{
        Scanner sc = new Scanner(System.in);
        articleArr=new ArrayList<>();
        System.out.println("Loading....");
        Document doc = Jsoup.connect("https://m.vnexpress.net/").get();
        Elements newsHeadlines = doc.select(".container .sidebar_home_1 h3.title_news a:first-child");
        System.out.println("News list:");
        for (Element headline : newsHeadlines) {           
             Article article = new Article();
             article.setStatus(1);
             article.setTitle(headline.text());
             article.setUrl(headline.attr("href"));
             articleArr.add(article);
        }
        for(int i=0;i<articleArr.size();i++){
            System.out.println(i+1+"."+articleArr.get(i).getTitle());
        }
        System.out.println("0.Return");
        while(true){
            System.out.println("================");
            System.out.println("Please enter number of article your choice:");
            int pick = sc.nextInt();
            if(pick==0){
                break;
            }else if(pick<=articleArr.size() && pick>0){
                getArticleDetail(articleArr.get(pick-1).getUrl());
                break;
            }else{
                System.out.println("Wrong number. Please try again!");
            }
        }
    }
    
    @Override
    public void getListCategories() throws IOException{
        ArrayList<Category> categoryArr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Loading.....");
        Document doc = Jsoup.connect("https://vnexpress.net/").get();
        Elements newsHeadlines = doc.select("#main_menu a");
        for (Element headline : newsHeadlines) {
            Category category = new Category();
            category.setName(headline.text());
            category.setUrl(checkUrl(headline.attr("href")));
            categoryArr.add(category);
        }
        while(true){
            System.out.println("================");
            System.out.println("Category list:");
            for(int i=0;i<categoryArr.size();i++){
                if(i==0){
                    categoryArr.get(i).setName("Trang chủ");
                    categoryArr.get(i).setUrl("https://vnexpress.net/");
                }
                System.out.println(i+1+"."+categoryArr.get(i).getName());
            }
            System.out.println("0.Return");
            System.out.println("================");
            System.out.println("Please enter number of article your choice:");
            int pick = sc.nextInt();
            if(pick==0){
                break;
            }else if(pick<=categoryArr.size() && pick>0){
                getArticleByCategory(categoryArr.get(pick-1).getUrl());
            }else{
                System.out.println("Wrong syntax. Please try again!");
            }
        }
    }
    
    public void getArticleByCategory(String url) throws IOException{
        Scanner sc = new Scanner(System.in);
        articleArr=new ArrayList<>();
        System.out.println("Loading....");
        Document doc = Jsoup.connect(url).get();
        Elements newsHeadlines = doc.select(".container .sidebar_1 h3.title_news a:first-child");
        System.out.println("News list:");
        for (Element headline : newsHeadlines) {           
             Article article = new Article();
             article.setStatus(1);
             article.setTitle(headline.text());
             article.setUrl(headline.attr("href"));
             articleArr.add(article);
        }
        
        for(int i=0;i<articleArr.size();i++){
            System.out.println(i+1+"."+articleArr.get(i).getTitle());
        }
        System.out.println("0.Return");
        while(true){
            System.out.println("================");
            System.out.println("Please enter number of article your choice:");
            int pick = sc.nextInt();
            if(pick==0){
                break;
            }else if(pick<=categoryArr.size() && pick>0){
                getArticleDetail(articleArr.get(pick-1).getUrl());
                break;
            }else{
                System.out.println("Wrong syntax. Please try again!");
            }
        }
    }
    
    public void getArticleDetail(String articleLink) throws IOException{
        Scanner sc= new Scanner(System.in);
        System.out.println("================");
        Document doc = Jsoup.connect(articleLink).get();
        Elements newsHeadlines = doc.select(".sidebar_1 .title_news_detail.mb10");
        for (Element headline : newsHeadlines) {
            System.out.println("Title: "+headline.text());
        }
        newsHeadlines = doc.select(".sidebar_1 .content_detail.fck_detail p");
        System.out.println("Content: ");
        for (Element headline : newsHeadlines) {
            System.out.println(headline.text());
        }
        System.out.println("================");
        System.out.println("Enter any key: ");
        sc.nextLine();
        getIndexArticles();
    }
    
    public String checkUrl(String url){
        try {
            URL link = new URL(url);
            link.getHost();
            return url;
        } catch (MalformedURLException ex) {
            String reUrl = "https://vnexpress.net"+url;
            return reUrl;
        }
    }
}
