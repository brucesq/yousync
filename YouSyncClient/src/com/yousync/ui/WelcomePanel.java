package com.yousync.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.yousync.core.Application;
import com.yousync.core.BussinessService;

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
				BussinessService.logout();
			}
		});
		button.setBounds(326, 6, 117, 29);
		add(button);
		
		JButton btnInstallAll = new JButton("Ò»¼ü°²×°");
		btnInstallAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Application.installAll();
			}
		});
		btnInstallAll.setBounds(500, 6, 117, 29);
		add(btnInstallAll);

	}
	
	public void setContent(String content){
		welcomeLabel.setText(content);
	}
	JLabel welcomeLabel ;
}
