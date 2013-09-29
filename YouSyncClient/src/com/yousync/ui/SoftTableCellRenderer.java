package com.yousync.ui;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.EventObject;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

import org.apache.commons.lang.StringUtils;

import com.yousync.core.Application;
import com.yousync.model.SoftwareObject;

public class SoftTableCellRenderer implements TableCellRenderer,
		TableCellEditor {

	private SoftTableCellPanel panel;


	public SoftTableCellRenderer() {
		panel = new SoftTableCellPanel();

	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		
		if(value == null)
			return new JPanel();
		
		SoftwareObject cellValue = (SoftwareObject) value;
		
		panel.updateProp(cellValue.getSoftName(), cellValue.getSoftTypeName(),
				getImageIcon(cellValue));

//		if (hasFocus) {
//			panel.setBorder(UIManager
//					.getBorder("Table.focusCellHighlightBorder"));
//		} else {
//			panel.setBorder(null);
//		}

		return panel;
	}

	@Override
	public void addCellEditorListener(CellEditorListener arg0) {

	}

	@Override
	public void cancelCellEditing() {

	}

	@Override
	public Object getCellEditorValue() {
		return null;
	}

	@Override
	public boolean isCellEditable(EventObject arg0) {
		return true;
	}

	@Override
	public void removeCellEditorListener(CellEditorListener arg0) {

	}

	@Override
	public boolean shouldSelectCell(EventObject arg0) {
		return true;
	}

	@Override
	public boolean stopCellEditing() {
		return true;
	}

	@Override
	public Component getTableCellEditorComponent(JTable table, Object value,
			boolean isSelected, int row, int col) {
		
		if(value == null)
			return new JPanel();
		
		
		SoftTableCellPanel panel = new SoftTableCellPanel();
		
		final SoftwareObject cellValue = (SoftwareObject) value;
		panel.updateProp(cellValue.getSoftName(), cellValue.getSoftTypeName(),
				getImageIcon(cellValue));
		
		panel.getInstanllButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 installApkAction(cellValue);
			}
		});
	
		return panel;
	}

	private void installApkAction(SoftwareObject softwareObject) {
		Application.installAPK(softwareObject,null);
	}

	private ImageIcon getImageIcon(SoftwareObject softwareObject) {
		ImageIcon image = null;
		if (StringUtils.isNotEmpty(softwareObject.getCacheImageFile())) {
			image = new ImageIcon(softwareObject.getCacheImageFile());
		} else {
			String cacheFile = Application.checkCacheFileExist(
					softwareObject.getSoftImageUrl(), "");
			if (StringUtils.isNotEmpty(cacheFile)) {
				image = new ImageIcon(cacheFile);
			} else {
				try {
					image = new ImageIcon(new URL(
							softwareObject.getSoftImageUrl()));
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			}
		}

		if (image != null) {
			image.setImage(image.getImage().getScaledInstance(60, 60,
					Image.SCALE_DEFAULT));
		}
		return image;
	}
}
