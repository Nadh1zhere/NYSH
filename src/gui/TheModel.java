/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lenovo
 */
//Claase TheModel qui va servir à afficher les images 
public class TheModel extends AbstractTableModel{

    private String [] columns ;
    private Object [][] rows;
    
    public TheModel(){}

    public TheModel(String[] columns, Object[][] rows) {
        this.columns = columns;
        this.rows = rows;
    }
    
    @Override
    public Class getColumnClass (int column)
    {
        if(column==5)
        {
            return Icon.class;
        }
        else{
            return getValueAt(0,column).getClass();
        }
    }
    
    @Override
    public int getRowCount() {
        return this.rows.length;
    }

    
    @Override
    public int getColumnCount() {
     return this.columns.length;
    }

   
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       return this.rows[rowIndex][columnIndex];
    }
    @Override
    public String getColumnName(int col){
        return this.columns[col];
    }
    
}
