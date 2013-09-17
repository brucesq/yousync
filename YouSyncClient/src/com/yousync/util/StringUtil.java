package com.yousync.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.lang.StringUtils;

public class StringUtil {

	private static final String COLON_SLASH_SLASH = "://";

	public static String getDomain(String url) {
		if (url == null || StringUtils.isEmpty(url))
			return "";
		Pattern p = Pattern.compile(
				"(?<=http://|\\.)[^.]*?\\.(com|cn|net|org|biz|info|cc|tv)",
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = p.matcher(url);
		if (matcher.find()) {
			String url1 = matcher.group();
			return url1;
		}
		return "";
	}

	public static String adsUrl(String url, String source_url) {
		// 做hrefurl补全 两种情况 http开头的不用补全
		String new_url = "";
		if (!url.startsWith("http")) {// 需要补全 Url
			if (url.startsWith("/")) {
				String domain = StringUtil.getDomain(source_url);
				new_url = source_url.substring(0, source_url.indexOf(domain)
						+ domain.length())
						+ url;
			} else {
				String base = source_url.substring(0,
						source_url.lastIndexOf("/") + 1);
				new_url = base + url;
			}

		}
		if (StringUtils.isEmpty(new_url))
			new_url = url;
		return new_url;
	}

	public static String decode(String str) {
		try {
			int length = str.length();
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < length; i++) {
				char c = str.charAt(i);
				if (i < length / 2)
					builder.append(decodeChar(c));
				else
					builder.append(c);
			}
			String result = new String(
					hex.decode(builder.toString().getBytes("utf-8")),"utf-8");
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}

	public static String encode(String str) {
		try {
			String result = new String(hex.encode(str.getBytes("utf-8")),
					"utf-8");

			int length = result.length();
			StringBuilder builder = new StringBuilder();

			for (int i = 0; i < length; i++) {
				char c = result.charAt(i);
				if (i < length / 2)
					builder.append(decodeChar(c));
				else
					builder.append(c);
			}
			return builder.toString();
		} catch (Exception e) {
			return str;
		}
	}

	private static char decodeChar(char c) {
		if (c == '1') {
			return '2';
		}
		if (c == '2') {
			return '1';
		}
		if (c == '3') {
			return '5';
		}
		if (c == '5') {
			return '3';
		}
		if (c == '6') {
			return '8';
		}
		if (c == '8') {
			return '6';
		}
		return c;
	}

	public static long createKey(String url) {
		int index = url.indexOf(COLON_SLASH_SLASH);
		if (index > 0) {
			index = url.indexOf('/', index + COLON_SLASH_SLASH.length());
		}
		CharSequence hostPlusScheme = (index == -1) ? url : url.subSequence(0,
				index);
		long tmp = FPGenerator.std24.fp(hostPlusScheme);
		return tmp | (FPGenerator.std40.fp(url) >>> 24);
	}

	private static Hex hex = new Hex();

	// private static Metaphone metaphone = new Metaphone();
	// private static RefinedSoundex refinedSoundex = new RefinedSoundex();
	// private static Soundex soundex = new Soundex();

	public static void main(String[] args) {
		String url1 = "http://news.xinhuanet.com/video/2011-06/16/c_121541798_7.htm";
		String url2 = "http://news.163.com/11/0616/10/76LNNRGH0001124J.html";
		String do1 = getDomain(url1);
		String do2 = getDomain(url2);
		System.out.println(do1 + " : " + do2);
		System.out.println(encode("aassasd您那你"));// 61617373617364c4fac4c7c4e3
		System.out.println(decode(encode("aassasd您那你")));
	}
}