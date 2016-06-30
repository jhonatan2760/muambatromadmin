/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.muambatrom.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jhonatan
 */
public class Connector {
    
    private static final String url = "jdbc:mysql://exemplo222222.mysql.uhserver.com/exemplo222222";
    private static final String login = "loader222";
    private static final String senha = "jhonatan@r7.com";
    
    public static Connection retrieveConnection(){
        Connection conn = null;
        
        try{
            DriverManager.registerDriver( new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(url, login, senha);
            
            return conn;    
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return conn;
    }
    
    
    public static void main (String [] args){
            PesquisaDao p = new PesquisaDao();
            System.out.println(p.getAll().size());
    }
}
