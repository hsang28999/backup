/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.cafeBizReader;
import java.io.IOException;
import java.sql.SQLException;
import model.cafeBizModel;

/**
 *
 * @author hsang
 */
public class Main {

    public static void main(String[] args) throws IOException, SQLException {
        cafeBizReader ctrl = new cafeBizReader();
        cafeBizModel model = new cafeBizModel();
        ctrl.getIndexArticle();
    }
    
}
