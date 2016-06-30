/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.muambatrom.table;

import br.com.muambatrom.connector.Pesquisa;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jhonatan
 */
public class PesquisaTable extends AbstractTableModel {

    private final ArrayList<Pesquisa> pesquisa;
    private final String [] names = new String [] {"Id","Chave Busca","Quantidade Encontrada","Data"};
    
    public PesquisaTable(ArrayList<Pesquisa> pesquisa){
        this.pesquisa = pesquisa;
    }
    
    @Override
    public int getRowCount() {
        return this.pesquisa.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        return names[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            
            case 0 : {
                return this.pesquisa.get(rowIndex).getIdPesquisa();
            }
            
            case 1 : {
                return this.pesquisa.get(rowIndex).getChavePesquisa();
            }
            
            case 2 : {
                return this.pesquisa.get(rowIndex).getResultadoPesquisa();
            }
            
            case 3 : {
                return this.pesquisa.get(rowIndex).getData();
            }
            
            default : {
                return "";
            }
        }
        
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
