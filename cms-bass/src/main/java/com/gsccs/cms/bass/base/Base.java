package com.gsccs.cms.bass.base;



public class Base {


	/**
	 * 把变量名第一个字设置为大写
	 * 
	 * @return
	 */
	public String varMethodName(String varName) {
		if (varName != null && varName.trim().length() > 0) {
			return varName.replaceFirst(varName.substring(0, 1), varName
					.substring(0, 1).toUpperCase());
		}
		return varName;
	}
}
