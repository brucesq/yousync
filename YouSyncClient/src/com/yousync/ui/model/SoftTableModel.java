/**
 * 
 */
package com.yousync.ui.model;

import java.io.Serializable;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.yousync.model.SoftwareObject;

/**
 * @author quanzhi
 *
 */
public class SoftTableModel extends AbstractTableModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6331711490956494819L;
	private List<SoftwareObject> models;
	private int columnCount;
	
	public void setModels(List<SoftwareObject> models){
		this.models = models;
	}
	
	public SoftTableModel(List<SoftwareObject> models,int columnCount){
		this.models = models;
		this.columnCount = columnCount;
	}
	
	@Override
	public int getColumnCount() {
		return columnCount;
	}

	
	@Override
	public int getRowCount() {
		double size = models.size();
		double csize = columnCount;
		return (int)Math.ceil(size / csize);
		
	}

	
	@Override
	public Object getValueAt(int row, int column) {
		if(row*columnCount+column >= models.size())
			return null;
		return models.get(row*columnCount+column);
	}
	
	@Override  
    public boolean isCellEditable(int row, int column)  
    {  
		return true;
    }

}
