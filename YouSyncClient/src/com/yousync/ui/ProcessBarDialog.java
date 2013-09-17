package com.yousync.ui;

import javax.swing.JDialog;
import javax.swing.JLabel;

import com.yousync.util.ImageUtils;

public class ProcessBarDialog extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5145142990523132344L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ProcessBarDialog dialog = new ProcessBarDialog("安装中");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			Thread.sleep(5000);
			dialog.finishDialog("成功");
			Thread.sleep(1000);
			dialog.dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ProcessBarDialog(String info) {
		this.setResizable(false);
		setBounds(300, 300, 300, 100);
		getContentPane().setLayout(null);
		
		infoLabel = new JLabel(info);
		infoLabel.setBounds(0, 28, 98, 16);
		getContentPane().add(infoLabel);
//		if(isLo)
		loding = new JLabel(ImageUtils.getImageIcon("icon/loading.gif"));
		loding.setBounds(110, 20, 184, 35);
		getContentPane().add(loding);
	}
	
	public void finishDialog(String info){
		infoLabel.setText(info);
		loding.setVisible(false);
	}
	private JLabel infoLabel;
	private JLabel loding;
}
