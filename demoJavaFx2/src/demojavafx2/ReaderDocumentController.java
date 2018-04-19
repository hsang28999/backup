/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojavafx2;

import entity.Article;
import entity.Category;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 *
 * @author hsang
 */
public class ReaderDocumentController implements Initializable {
    
    @FXML
    private ArrayList<Article> articleArr = new ArrayList<>();
    
    @FXML
    private ArrayList<Category> categoryArr = new ArrayList<>();
    
    @FXML
    private ListView listViewVE;
    
    @FXML
    private ListView listViewDT;
    
    @FXML
    ListView<Article> list = new ListView<>();
    
    @FXML
    private void getIndexArticlesButton(ActionEvent event) throws IOException {
        getIndexArticles();
    }
    
    @FXML
    private void getDetailArticle() throws IOException {
        System.out.println("click");
    }
    
    @FXML
    private void getListCategoriesButton(ActionEvent event) throws IOException {
        getListCategories();
    }
    
    @FXML
    public void getIndexArticles() throws IOException{
        ObservableList<String> items = FXCollections.observableArrayList();
        ObservableList<Article> articleArr = FXCollections.observableArrayList();
        Document doc = Jsoup.connect("https://vnexpress.net/").get();
        Elements newsHeadlines = doc.select(".container .sidebar_home_1 h3.title_news a:first-child");
        for (Element headline : newsHeadlines) {           
             Article article = new Article();
             article.setStatus(1);
             article.setTitle(headline.text());
             article.setUrl(headline.attr("href"));
             articleArr.add(article);
        }
        for(int i=0;i<articleArr.size();i++){
            items.add(articleArr.get(i).getTitle());
        }
        listViewVE.setItems(items);
    }
    
    @FXML
    public void getListCategories() throws IOException{
        ArrayList<Category> categoryArr = new ArrayList<>();
        ObservableList<String> items = FXCollections.observableArrayList();
        Document doc = Jsoup.connect("https://vnexpress.net/").get();
        Elements newsHeadlines = doc.select("#main_menu a");
        for (Element headline : newsHeadlines) {
            Category category = new Category();
            category.setName(headline.text());
            category.setUrl(checkUrl(headline.attr("href")));
            categoryArr.add(category);
        }
        for(int i=0;i<categoryArr.size();i++){
            if(i==0){
                categoryArr.get(i).setName("Trang chủ");
                categoryArr.get(i).setUrl("https://vnexpress.net/");
            }
            items.add(categoryArr.get(i).getName());
        }
        listViewVE.setItems(items);        
    }  
    
    @FXML
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
