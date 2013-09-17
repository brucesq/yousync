package com.mpn.service.test;

import org.springside.modules.security.utils.Digests;
import org.springside.modules.utils.Encodes;

public class Test {
	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	public static void main(String[] args){
		byte[] salt = Digests.generateSalt(8);
		String sss = (Encodes.encodeHex(salt));

		byte[] hashPassword = Digests.sha1("admin".getBytes(), salt, HASH_INTERATIONS);
		String pd = (Encodes.encodeHex(hashPassword));
		System.out.println(sss+":::::"+pd);
	}
}
