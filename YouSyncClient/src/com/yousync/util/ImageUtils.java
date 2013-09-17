/**
 * 
 */
package com.yousync.util;

import java.net.URL;

import javax.swing.ImageIcon;

/**
 * @author quanzhi
 *
 */
public class ImageUtils {

	
	public static ImageIcon getImageIcon(String icon){
		URL url = ImageUtils.class.getClassLoader().getResource(icon);
		return new ImageIcon(url);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(ImageUtils.class.getClassLoader().getResource(""));
		// TODO Auto-generated method stub
		getImageIcon("icon/loading.gif");
	}

}
