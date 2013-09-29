package com.yousync.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomePanel extends JPanel {

	private ApplicationWindow mApplicationWindow;
	/**
	 * Create the panel.
	 */
	public WelcomePanel(ApplicationWindow pApplicationWindow) {
		setLayout(null);
		mApplicationWindow = pApplicationWindow;
		welcomeLabel = new JLabel("");
		welcomeLabel.setBounds(6, 6, 293, 33);
		add(welcomeLabel);
		
		JButton button = new JButton("\u9000\u51FA");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mApplicationWindow.showLoginPanel();
			}
		});
		button.setBounds(326, 6, 117, 29);
		add(button);

	}
	
	public void setContent(String content){
		welcomeLabel.setText(content);
	}
	JLabel welcomeLabel ;
}
