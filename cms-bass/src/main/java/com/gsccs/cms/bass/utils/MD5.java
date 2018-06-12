package com.gsccs.cms.bass.utils;

import java.security.MessageDigest;

public class MD5 {
	public final static String MD5(String s) {
		if (s == null) {
			return null;
		}
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			byte[] strTemp = s.getBytes();
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(strTemp);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			return null;
		}
	}

	// 加密后解密
	public static String JM(String inStr) {
		char[] a = inStr.toCharArray();
		for (int i = 0; i < a.length; i++) {
			a[i] = (char) (a[i] ^ 't');
		}
		String k = new String(a);
		return k;
	}

	// 可逆的加密算法
	public static String KL(String inStr) {
		// String s = new String(inStr);
		char[] a = inStr.toCharArray();
		for (int i = 0; i < a.length; i++) {
			a[i] = (char) (a[i] ^ 't');
		}
		String s = new String(a);
		return s;
	}

	// 800e5133ab8a4da242fa5eefed5a74e0
	// 96d1fc3988a1bac8d36ca3b171be6f98
	// 670b14728ad9902aecba32e22fa4f6bd
	// 800e5133ab8a4da242fa5eefed5a74e0
	public static void main(String[] args) {
		System.out.println(MD5("gsccs@2014"));
		System.out.println(MD5("gsccs2015"));
		System.out.println(MD5("gsccs@2015"));
		System.out.println(MD5("000000"));
		//GLGCGM@BBFABGGGEA@D;
		//GLGCGM@BBFABGGGEA@D
		System.out.println(KL("3c8b37fa39466a25ebb63d3ba3154d0a"));
	}
}