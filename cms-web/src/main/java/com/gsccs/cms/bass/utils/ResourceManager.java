package com.gsccs.cms.bass.utils;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * 资源管理器
 * @author x.d zhang
 *
 */
public class ResourceManager {
	
	private static Logger logger = Logger.getLogger(ResourceManager.class);
	
	public static boolean  uploadImage(File file,String filename){
		
		return true;
	}
	
	public static boolean uploadImage(byte[] data,String toFileName){
		return true;
	}
	
	
	public static boolean uploadImage(String srcFilePath,String toFileName){
		URL url = null;
		InputStream is = null;
		try {
			url = new URL(srcFilePath);
			is = url.openStream();
			byte[] buffer = new byte[8192];
			while (is.read(buffer, 0, 8192) != -1) {
				//uploadManager.put(buffer, toFileName, uploadToken);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("上传图片出现异常："+e.getMessage());
			return false;
		}finally{
			try{
				if(is!=null){
					is.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String getFilepath(String directory){
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
    	return directory+"/"+df.format(new Date())+System.currentTimeMillis();
    }
}
