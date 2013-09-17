package com.yousync.ui;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.yousync.core.Application;
import com.yousync.model.SoftwareObject;
import com.yousync.util.ImageUtils;

public class ApplicationWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationWindow window = new ApplicationWindow();
					window.frame.setVisible(true);
					Application.initialization(window);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ApplicationWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
//		JFrame.setDefaultLookAndFeelDecorated(true);
//        JDialog.setDefaultLookAndFeelDecorated(true);
//        SkinUtils.setThemeRaven();
//      --- SkinUtils.setThemeAutumn();
//      --  SkinUtils.setThemeBusiness();
//        SkinUtils.setThemeBusinessBlackSteel();
//      --  SkinUtils.setThemeCreme();
//      --  SkinUtils.setThemeEmeraldDusk();
//     --   SkinUtils.setThemeNebula();
//       -- SkinUtils.setThemeNebulaBrickWall();
//      --  SkinUtils.setThemeOfficeBlue2007();
        
//       SkinUtils.setThemeOfficeSilver2007();
//       -- SkinUtils.setThemeSahara();
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(ImageUtils.getImageIcon("icon/logo.png").getImage());

		mainPanel = new SoftwareTablePanel();
		mainPanel.setBounds(0, 40, 800, 508);
		frame.getContentPane().add(mainPanel);
		

		statusPanel = new JPanel();
		statusPanel.setBounds(0, 550, 800, 24);
		frame.getContentPane().add(statusPanel);
		statusPanel.setLayout(null);

		statusLabel = new JLabel("");
		statusLabel.setBounds(0, 0, 400, 16);
		statusPanel.add(statusLabel);
		
		rightStatusLabel = new JLabel("");
		rightStatusLabel.setBounds(620, 0, 180, 16);
		statusPanel.add(rightStatusLabel);
		
		centerStatusLabel = new JLabel("");
		centerStatusLabel.setBounds(400, 0, 200, 16);
		statusPanel.add(centerStatusLabel);
		
		loginPanel = new LoginPanel(this);
		loginPanel.setBounds(0, 0, 794, 41);
		frame.getContentPane().add(loginPanel);
		
		welcomePanel = new WelcomePanel(this);
		welcomePanel.setBounds(0, 0, 794, 41);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Application.close();
				System.exit(0);
			}
		});

	}

	public void setStatus(String statusValue) {
		statusLabel.setText(statusValue);
	}
	
	public void setRightStatus(String statusValue,boolean isLoading){
		rightStatusLabel.setText(statusValue);
		if(isLoading){
			rightStatusLabel.setHorizontalTextPosition(SwingConstants.LEFT);
			rightStatusLabel.setIcon(ImageUtils.getImageIcon("icon/loading.gif"));
		}else{
			rightStatusLabel.setIcon(null);
		}
	}
	
	public void setCenterStatus(String value){
		centerStatusLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		centerStatusLabel.setText(value);
	}
	
	public void setSoftModels(List<SoftwareObject> models){
		mainPanel.setSoftModels(models);
	}
	
	public void showLoginPanel(){
		frame.getContentPane().remove(welcomePanel);
		frame.getContentPane().add(loginPanel);
		frame.getContentPane().repaint();
	}
	public void showWelcomePanel(String name){
		frame.getContentPane().remove(loginPanel);
		frame.getContentPane().add(welcomePanel);
		welcomePanel.setContent("ª∂”≠ "+name +"  π”√£°");
		frame.getContentPane().repaint();
	}

	private JLabel statusLabel;
	private SoftwareTablePanel mainPanel;
	private JPanel statusPanel;
	private JLabel rightStatusLabel;
	private JLabel centerStatusLabel;
	private LoginPanel loginPanel;
	private WelcomePanel welcomePanel;
}
