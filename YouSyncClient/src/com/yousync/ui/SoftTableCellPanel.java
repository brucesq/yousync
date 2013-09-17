package com.yousync.ui;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoftTableCellPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8105590935021888380L;
	// private SoftwareObject softwareObject;

	private JLabel imageLabel;
	private JLabel softName;
	private JLabel softClass;
	private JButton button;

	/**
	 * Create the panel.
	 */
	public SoftTableCellPanel() {
		// this.softwareObject = softwareObject;
		initComponents();

	}

	public void updateProp(String softNameStr, String softTypeStr,
			ImageIcon icon) {
		softName.setText(softNameStr);
		softClass.setText(softTypeStr);
		imageLabel.setIcon(icon);

	}
	
	public JButton getInstanllButton(){
		return button;
	}

	private void initComponents() {
		setLayout(null);

		imageLabel = new JLabel("");
		imageLabel.setBounds(6, 6, 88, 88);
		add(imageLabel);

		softName = new JLabel("");
		softName.setBounds(106, 5, 112, 25);
//		softName.setFont(new java.awt.Font("Dialog",   1,   15));
		add(softName);

		softClass = new JLabel("");
		softClass.setBounds(116, 42, 71, 16);
		add(softClass);

		button = new JButton("°²×°");
		
		button.setBounds(106, 65, 83, 29);
		add(button);

	}

}
