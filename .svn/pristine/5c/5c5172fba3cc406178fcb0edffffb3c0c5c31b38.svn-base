package com.gsccs.cms.bass.utils;

import java.io.IOException;

//import org.apache.log4j.Logger;

/**
 * 
 * @author 
 *
 */
public class ShellScript {
	
	//private static Logger logger = Logger.getLogger("NGINX RELOAD");
	
	public static void reloadNginxServer(){
		
		String backcmd = "nginx -s reload";
		try {
			Runtime rt = Runtime.getRuntime();
			rt.exec("" + backcmd);
			//logger.info("NGINX reload success");
		} catch (IOException e) {
			//e.printStackTrace();
			//logger.info("NGINX reload fail!"+e.getMessage());
		}
	}


}
