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
    //�����ṩһ�����������ù�������ʵ��ί�и�DefaultTableModel����  
    public ExtendedTableModel(String[] columnNames , Object[][] cells)  
    {  
        super(cells , columnNames);  
    }  
    //��дgetColumnClass����������ÿ�еĵ�һ��ֵ����������ʵ����������  
    public Class getColumnClass(int c)   
    {  
        return getValueAt(0 , c).getClass();  
    }  
}
