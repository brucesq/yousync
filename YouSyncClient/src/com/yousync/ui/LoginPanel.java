package com.yousync.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.yousync.core.BussinessService;

public class LoginPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField userTextField;
	private JTextField passwordTextField;

	private ApplicationWindow mApplicationWindow;

	/**
	 * Create the panel.
	 */
	public LoginPanel(ApplicationWindow pApplicationWindow) {
		setLayout(null);
		mApplicationWindow = pApplicationWindow;
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D\uFF1A");
		lblNewLabel.setBounds(17, 6, 74, 22);
		add(lblNewLabel);

		userTextField = new JTextField();
		userTextField.setBounds(81, 3, 130, 28);
		add(userTextField);
		userTextField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801\uFF1A");
		lblNewLabel_1.setBounds(231, 9, 61, 16);
		add(lblNewLabel_1);

		passwordTextField = new JTextField();
		passwordTextField.setBounds(279, 3, 124, 28);
		add(passwordTextField);
		passwordTextField.setColumns(10);

		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login();
			}
		});
		btnNewButton.setBounds(415, 4, 117, 29);
		add(btnNewButton);

	}

	public void login() {
		String password = passwordTextField.getText();
		String name = userTextField.getText();
		System.out.println(password + ":" + name);
		if (BussinessService.login(name, password)) {
			mApplicationWindow.showWelcomePanel(name);
		} else {
			JOptionPane.showMessageDialog(null, "”√ªß√˚√‹¬Î¥ÌŒÛ£°");
		}
	}
}
