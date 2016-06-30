/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.muambatrom.guiRunnable;

import br.com.muambatrom.connector.Pesquisa;
import br.com.muambatrom.table.PesquisaTable;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jhonatan
 */
public class TableRender implements Runnable {

     private final int width = 300;
     private final int height = 64;
     private final JTable table;
     private final JFrame frame;
     
     public TableRender(JFrame frame, JTable table){
        this.table = table;
        this.frame = frame;
     }
     
    @Override
    public void run() {
        table.setSize(0, 0);
        table.setModel(new DefaultTableModel());
        table.setModel(new PesquisaTable(new Pesquisa().getAllData()));
    }
    
}
