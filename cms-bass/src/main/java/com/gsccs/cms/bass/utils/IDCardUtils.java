package com.gsccs.cms.bass.utils;

public class IDCardUtils {

	
	public static void main(String[] args) {
		String idcode = "62282719850201411X";
		String birthday = getBirthday(idcode);
		String sex = getSex(idcode);
		System.out.println(birthday);
		System.out.println(sex);
	}
	
	
	public static String getBirthday(String cardId) {
        if(cardId.length()==15){
        	return cardId.substring(4, 12);
        }else if(cardId.length()==18){
            return cardId.substring(6, 14);
        }else{
            return null;
        }
    }
	
	
	public static String getSex(String cardId) {
        if(cardId.length()==15){
        	return Integer.parseInt(cardId.substring(14,15))%2==0?"女":"男";
        }else if(cardId.length()==18){
            return Integer.parseInt(cardId.substring(16,17))%2==0?"女":"男";
        }else{
            return null;
        }
    }
}
