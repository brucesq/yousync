/**
 * 
 */
package com.yousync.ui.model;

import javax.swing.table.DefaultTableModel;

/**
 * @author quanzhi
 *
 */
public class ExtendedTableModel extends DefaultTableModel{
    //重新提供一个构造器，该构造器的实现委托给DefaultTableModel父类  
    public ExtendedTableModel(String[] columnNames , Object[][] cells)  
    {  
        super(cells , columnNames);  
    }  
    //重写getColumnClass方法，根据每列的第一个值来返回其真实的数据类型  
    public Class getColumnClass(int c)   
    {  
        return getValueAt(0 , c).getClass();  
    }  
}
