package com.yousync.ui;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

import com.yousync.model.SoftwareObject;
import com.yousync.ui.model.SoftTableModel;

public class SoftwareTablePanel extends javax.swing.JScrollPane {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8957446977980236544L;
	private JTable softwareTable;
	private List<SoftwareObject> models = new ArrayList<SoftwareObject>();

	private SoftTableModel model ;
	/**
	 * Create the panel.
	 */
	public SoftwareTablePanel() {
		init();
	}

	public void setSoftModels(List<SoftwareObject> models){
		this.models = models;
		model.setModels(models);
		model.fireTableDataChanged();
		
	}
	private void init() {

		model = new SoftTableModel(models,3);
        softwareTable = new JTable(model);

        softwareTable.setRowSelectionAllowed(false);
        softwareTable.setRowHeight(110);

        softwareTable.getTableHeader().setVisible(false);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setPreferredSize(new Dimension(0, 0));
        softwareTable.getTableHeader().setDefaultRenderer(renderer);
        
        softwareTable.setRowSelectionAllowed(false);
        softwareTable.setColumnSelectionAllowed(false);

        
        for (int i = 0; i < 3; i++) {
        	SoftTableCellRenderer softRenderer = new SoftTableCellRenderer();
            TableColumn lastColumn = softwareTable.getColumnModel().getColumn(i);
            lastColumn.setCellRenderer(softRenderer);
            lastColumn.setCellEditor(softRenderer);
        }
        
        this.setViewportView(softwareTable);
    }
}
