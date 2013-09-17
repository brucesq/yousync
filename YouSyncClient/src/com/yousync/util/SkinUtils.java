/**
 * 
 */
package com.yousync.util;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.api.SubstanceConstants.ImageWatermarkKind;
import org.jvnet.substance.api.SubstanceSkin;
import org.jvnet.substance.skin.AutumnSkin;
import org.jvnet.substance.skin.BusinessBlackSteelSkin;
import org.jvnet.substance.skin.BusinessSkin;
import org.jvnet.substance.skin.CremeSkin;
import org.jvnet.substance.skin.EmeraldDuskSkin;
import org.jvnet.substance.skin.NebulaBrickWallSkin;
import org.jvnet.substance.skin.NebulaSkin;
import org.jvnet.substance.skin.OfficeBlue2007Skin;
import org.jvnet.substance.skin.OfficeSilver2007Skin;
import org.jvnet.substance.skin.RavenSkin;
import org.jvnet.substance.skin.SaharaSkin;
import org.jvnet.substance.skin.SubstanceAutumnLookAndFeel;
import org.jvnet.substance.skin.SubstanceBusinessBlackSteelLookAndFeel;
import org.jvnet.substance.skin.SubstanceBusinessLookAndFeel;
import org.jvnet.substance.skin.SubstanceCremeLookAndFeel;
import org.jvnet.substance.skin.SubstanceEmeraldDuskLookAndFeel;
import org.jvnet.substance.skin.SubstanceNebulaBrickWallLookAndFeel;
import org.jvnet.substance.skin.SubstanceNebulaLookAndFeel;
import org.jvnet.substance.skin.SubstanceOfficeBlue2007LookAndFeel;
import org.jvnet.substance.skin.SubstanceOfficeSilver2007LookAndFeel;
import org.jvnet.substance.skin.SubstanceRavenLookAndFeel;
import org.jvnet.substance.skin.SubstanceSaharaLookAndFeel;
import org.jvnet.substance.watermark.SubstanceImageWatermark;

/**
 * @author quanzhi
 * 
 */
public class SkinUtils {

	public static void setThemeRaven() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try {
			// �½�һ��ͼƬˮӡ��·�������Լ��ģ�ʹ���Լ�ϲ����ͼƬ����Ӧ�ó����ˮӡͼƬ��
			SubstanceImageWatermark watermark = new SubstanceImageWatermark(
					SkinUtils.class.getClassLoader().getResourceAsStream(
							"icon/black.jpg"));
			watermark.setKind(ImageWatermarkKind.APP_CENTER);
//			 ͸���ȵ���
			watermark.setOpacity((float) 0.9);
			UIManager.setLookAndFeel(new SubstanceRavenLookAndFeel());
			SubstanceSkin skin = new RavenSkin().withWatermark(watermark);

			SubstanceLookAndFeel.setSkin(skin);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
//	public static void set(){
//		org.jvnet.substance.skin.
//	}

	public static void setThemeSahara() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try {
			// �½�һ��ͼƬˮӡ��·�������Լ��ã�ʹ���Լ�ϲ����ͼƬ����Ӧ�ó����ˮӡͼƬ
			SubstanceImageWatermark watermark = new SubstanceImageWatermark(
					SkinUtils.class.getClassLoader().getResourceAsStream(
							"icon/black.jpg"));
			watermark.setKind(ImageWatermarkKind.APP_ANCHOR);
			// ͸���ȵ���
			watermark.setOpacity((float) 0.35);
			UIManager.setLookAndFeel(new SubstanceSaharaLookAndFeel());
			SubstanceSkin skin = new SaharaSkin().withWatermark(watermark);

			SubstanceLookAndFeel.setSkin(skin);

		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		}
	}

	public static void setThemeOfficeSilver2007() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try {
			// �½�һ��ͼƬˮӡ��·�������Լ��ģ�ʹ���Լ�ϲ����ͼƬ����Ӧ�ó����ˮӡͼƬ��
			SubstanceImageWatermark watermark = new SubstanceImageWatermark(
					SkinUtils.class.getClassLoader().getResourceAsStream(
							"icon/black.jpg"));
			watermark.setKind(ImageWatermarkKind.APP_CENTER);
			// ͸���ȵ���
			watermark.setOpacity((float) 0.35);
			UIManager
					.setLookAndFeel(new SubstanceOfficeSilver2007LookAndFeel());
			SubstanceSkin skin = new OfficeSilver2007Skin()
					.withWatermark(watermark);

			SubstanceLookAndFeel.setSkin(skin);

		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		}
	}

	public static void setThemeNebula() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try {
			// �½�һ��ͼƬˮӡ��·�������Լ��ģ�ʹ���Լ�ϲ����ͼƬ����Ӧ�ó����ˮӡͼƬ��
			SubstanceImageWatermark watermark = new SubstanceImageWatermark(
					SkinUtils.class.getClassLoader().getResourceAsStream(
							"icon/black.jpg"));
			watermark.setKind(ImageWatermarkKind.APP_CENTER);
			// ͸���ȵ���
			watermark.setOpacity((float) 0.55);
			UIManager.setLookAndFeel(new SubstanceNebulaLookAndFeel());
			SubstanceSkin skin = new NebulaSkin().withWatermark(watermark);

			SubstanceLookAndFeel.setSkin(skin);

		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		}
	}

	public static void setThemeNebulaBrickWall() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try {
			// �½�һ��ͼƬˮӡ��·�������Լ��ģ�ʹ���Լ�ϲ����ͼƬ����Ӧ�ó����ˮӡͼƬ��
			SubstanceImageWatermark watermark = new SubstanceImageWatermark(
					SkinUtils.class.getClassLoader().getResourceAsStream(
							"icon/black.jpg"));
			watermark.setKind(ImageWatermarkKind.APP_CENTER);
			// ͸���ȵ���
			watermark.setOpacity((float) 0.9);
			UIManager.setLookAndFeel(new SubstanceNebulaBrickWallLookAndFeel());
			SubstanceSkin skin = new NebulaBrickWallSkin()
					.withWatermark(watermark);

			SubstanceLookAndFeel.setSkin(skin);

		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		}
	}

	public static void setThemeAutumn() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try {
			// �½�һ��ͼƬˮӡ��·�������Լ��ģ�ʹ���Լ�ϲ����ͼƬ����Ӧ�ó����ˮӡͼƬ��
			SubstanceImageWatermark watermark = new SubstanceImageWatermark(
					SkinUtils.class.getClassLoader().getResourceAsStream(
							"icon/black.jpg"));
			watermark.setKind(ImageWatermarkKind.APP_CENTER);
			// ͸���ȵ���
			watermark.setOpacity((float) 0.9);
			UIManager.setLookAndFeel(new SubstanceAutumnLookAndFeel());
			SubstanceSkin skin = new AutumnSkin().withWatermark(watermark);

			SubstanceLookAndFeel.setSkin(skin);

		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		}
	}

	public static void setThemeBusiness() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try {
			// �½�һ��ͼƬˮӡ��·�������Լ��ģ�ʹ���Լ�ϲ����ͼƬ����Ӧ�ó����ˮӡͼƬ��
			SubstanceImageWatermark watermark = new SubstanceImageWatermark(
					SkinUtils.class.getClassLoader().getResourceAsStream(
							"icon/black.jpg"));
			watermark.setKind(ImageWatermarkKind.APP_CENTER);
			// ͸���ȵ���
			watermark.setOpacity((float) 0.9);
			UIManager.setLookAndFeel(new SubstanceBusinessLookAndFeel());
			SubstanceSkin skin = new BusinessSkin().withWatermark(watermark);

			SubstanceLookAndFeel.setSkin(skin);

		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		}
	}

	public static void setThemeCreme() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try {
			// �½�һ��ͼƬˮӡ��·�������Լ��ģ�ʹ���Լ�ϲ����ͼƬ����Ӧ�ó����ˮӡͼƬ��
			SubstanceImageWatermark watermark = new SubstanceImageWatermark(
					SkinUtils.class.getClassLoader().getResourceAsStream(
							"icon/black.jpg"));
			watermark.setKind(ImageWatermarkKind.APP_CENTER);
			// ͸���ȵ���
			watermark.setOpacity((float) 0.9);
			UIManager.setLookAndFeel(new SubstanceCremeLookAndFeel());
			SubstanceSkin skin = new CremeSkin().withWatermark(watermark);

			SubstanceLookAndFeel.setSkin(skin);

		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		}
	}

	public static void setThemeBusinessBlackSteel() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try {
			// �½�һ��ͼƬˮӡ��·�������Լ��ģ�ʹ���Լ�ϲ����ͼƬ����Ӧ�ó����ˮӡͼƬ��
			SubstanceImageWatermark watermark = new SubstanceImageWatermark(
					SkinUtils.class.getClassLoader().getResourceAsStream(
							"icon/black.jpg"));
			watermark.setKind(ImageWatermarkKind.APP_CENTER);
			// ͸���ȵ���
			watermark.setOpacity((float) 0.55);
			UIManager
					.setLookAndFeel(new SubstanceBusinessBlackSteelLookAndFeel());
			SubstanceSkin skin = new BusinessBlackSteelSkin()
					.withWatermark(watermark);

			SubstanceLookAndFeel.setSkin(skin);

		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		}
	}

	

	public static void setThemeEmeraldDusk() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try {
			// �½�һ��ͼƬˮӡ��·�������Լ��ģ�ʹ���Լ�ϲ����ͼƬ����Ӧ�ó����ˮӡͼƬ��
			SubstanceImageWatermark watermark = new SubstanceImageWatermark(
					SkinUtils.class.getClassLoader().getResourceAsStream(
							"icon/black.jpg"));
			watermark.setKind(ImageWatermarkKind.APP_CENTER);
			// ͸���ȵ���
			watermark.setOpacity((float) 0.9);
			UIManager.setLookAndFeel(new SubstanceEmeraldDuskLookAndFeel());
			SubstanceSkin skin = new EmeraldDuskSkin().withWatermark(watermark);

			SubstanceLookAndFeel.setSkin(skin);

		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		}
	}

	public static void setThemeOfficeBlue2007() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try {
			// �½�һ��ͼƬˮӡ��·�������Լ��ģ�ʹ���Լ�ϲ����ͼƬ����Ӧ�ó����ˮӡͼƬ��
			SubstanceImageWatermark watermark = new SubstanceImageWatermark(
					SkinUtils.class.getClassLoader().getResourceAsStream(
							"icon/black.jpg"));
			watermark.setKind(ImageWatermarkKind.APP_CENTER);
			// ͸���ȵ���
			watermark.setOpacity((float) 0.8);
			UIManager.setLookAndFeel(new SubstanceOfficeBlue2007LookAndFeel());
			SubstanceSkin skin = new OfficeBlue2007Skin()
					.withWatermark(watermark);
			SubstanceLookAndFeel.setSkin(skin);

		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		}
	}
}
