/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.muambatrom.connector;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jhonatan
 */
public class Pesquisa extends PesquisaDao {
    
        private long idPesquisa;
        private String chavePesquisa;
        private long resultadoPesquisa;
        private Date data;
        
        public Pesquisa(){}
        
        public void setIdPesquisa(long idPesquisa){
            this.idPesquisa = idPesquisa;
        }
        
        public long getIdPesquisa(){
            return this.idPesquisa;
        }
        
        public String getChavePesquisa(){
            return this.chavePesquisa;
        }
        
        public void setChavePesquisa(String chavePesquisa){
            this.chavePesquisa = chavePesquisa;
        }
        
        public void setResultadoPesquisa(long resultadoPesquisa){
            this.resultadoPesquisa = resultadoPesquisa;
        }
        
        public long getResultadoPesquisa(){
            return this.resultadoPesquisa;
        }
        
        public void setData(Date data){
            this.data = data;
        }
        
        public Date getData(){
            return this.data;
        }
    
    public ArrayList<Pesquisa> getAllData(){
        return this.getAll();
    }
}
