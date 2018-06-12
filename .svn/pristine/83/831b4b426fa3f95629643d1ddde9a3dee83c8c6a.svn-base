package com.gsccs.cms.bass.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * xml工具类
 * 
 * @author x.d zhang
 * @version 1.0
 * 
 */
public class XMLUtil {

	/**
	 * 生成xml文件
	 * 
	 * @param document
	 * @param filepath
	 */
	public static void writeFile(Document document, String filepath) {
		XMLWriter out = null;

		BufferedWriter bw = null;
		OutputStreamWriter osw = null;
		FileOutputStream fos = null;

		try {
			File xmlFile = new File(filepath);// 输出xml的路径
			fos = new FileOutputStream(xmlFile);
			osw = new OutputStreamWriter(fos, "UTF-8");// 指定编码，防止写中文乱码
			bw = new BufferedWriter(osw);

			// 对xml输出格式化
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding("UTF-8");
			out = new XMLWriter(bw, format);
			out.write(document);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (bw != null) {
					bw.close();
				}
				if (osw != null) {
					osw.close();
				}
				if (fos != null) {
					fos.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
