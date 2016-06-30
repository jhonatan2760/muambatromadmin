package br.com.muambatrom.connector;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jhonatan
 */
public class PesquisaDao {
    
      
        
        protected ArrayList<Pesquisa> getAll(){
            
            ArrayList<Pesquisa> lista = new ArrayList<>();
            Connection con;
            try {
                con = Connector.retrieveConnection();
                ResultSet rs = con.createStatement().executeQuery(" select * from pesquisa ORDER BY data DESC ");
                
                while(rs.next()){
                    lista.add(this.populateByResultSet(rs));
                }
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }finally{
                
            }
            
            return lista;
        }
        
        
        private Pesquisa populateByResultSet(ResultSet rs) throws SQLException{
            Pesquisa pesquisa = new Pesquisa();
            pesquisa.setIdPesquisa(rs.getLong("idPesquisa"));
            pesquisa.setChavePesquisa(rs.getString("chavePesquisa"));
            pesquisa.setResultadoPesquisa(rs.getLong("resultadoPesquisa"));
            pesquisa.setData(rs.getDate("data"));
            return pesquisa;
        }
        
}
