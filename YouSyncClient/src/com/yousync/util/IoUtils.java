/**
 * 
 */
package com.yousync.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author quanzhi
 *
 */
public class IoUtils {

    

    /**
     * No exception InputStream close method.
     */
    public final static void close(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (Exception ex) {
            }
        }
    }
    /**
     * No exception BufferedReader close method.
     */
    public final static void close(BufferedReader reader){
    	if(reader != null){
    		try{
    			reader.close();
    		}catch(Exception e){
    			
    		}
    	}
    }
    /**
     * No exception OutputStream close method.
     */
    public final static void close(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (Exception ex) {
            }
        }
    }
    public static void copy(String filename,File dest)throws IOException {
    	FileInputStream is = new FileInputStream(new File(filename));
    	copy(is,dest);
    }
    /**
     * Copy an input stream to file.
     * @param input
     * @param dest
     * @throws IOException
     */
    public static void copy(InputStream input, File dest) throws IOException{
    	try {
    		if(!dest.exists()){
    			int dex = dest.getAbsolutePath().lastIndexOf(File.separator);
    			if(dex > 0){
    				File outFilePath = new File(dest.getAbsolutePath().substring(0,dex));
    				if(!outFilePath.exists())
    							outFilePath.mkdirs();
    			}
    			dest.createNewFile();
    		}
    		FileOutputStream fos = new FileOutputStream(dest);
            byte[] buf = new byte[4096];
            try {
                int byteRead;
                while ((byteRead = input.read(buf)) != -1) {
                    fos.write(buf, 0, byteRead);
                }
            } finally {
                fos.close();
            }
        } finally {
        	close(input);
        }
    }
    /**
     * Copy an input stream to output. If closed is true, close input.
     * @param input
     * @param output
     * @param closed
     * @throws IOException
     */
    public static void copy(InputStream input, OutputStream output , boolean closed) throws IOException{
    	try {
            byte[] buf = new byte[4096];
            int byteRead;
            while ((byteRead = input.read(buf)) != -1) {
            	output.write(buf, 0, byteRead);
             }
            output.flush();
        } finally {
        	if(closed){
        		close(input);
        	}
        	
        }
    }
    
    
    public static void saveFileFromUrl(String imgurl, String targetFile,
			String referer) {
		int contentLength = 0;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			URL url = new URL(imgurl);
			URLConnection urlconn = url.openConnection();
			HttpURLConnection httpconn = (HttpURLConnection) urlconn;
			if (referer != null && referer.length() > 5) {
				httpconn.setRequestProperty("referer", referer);
			}
			httpconn.setRequestProperty("User-Agent",
					"Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1; Trident/4.0)");
			httpconn.setConnectTimeout(240000);
			httpconn.setReadTimeout(300000);

			int resCode = httpconn.getResponseCode();
			if (resCode != HttpURLConnection.HTTP_OK) {
				System.out.println("Response Code:" + resCode);
//				changeURLAndSaveImage(imgurl, targetFile, referer);
			} else {
				contentLength = httpconn.getContentLength();
				int streamLength = 0;
				bis = new BufferedInputStream(urlconn.getInputStream());
				bos = new BufferedOutputStream(new FileOutputStream(targetFile));
				byte[] buffer = new byte[1024];
				int num = -1;
				while (true) {
					num = bis.read(buffer);
					if (num == -1) {
						bos.flush();
						break;
					}
					streamLength += num;
					bos.flush();
					bos.write(buffer, 0, num);
				}
				bos.close();
				bis.close();
				if (contentLength - streamLength > 1000)
					System.out
							.println("[SaveFileLength Exception][TargetFile="
									+ targetFile + "][URL=" + imgurl
									+ "][streamLength=" + streamLength
									+ "][contentLength=" + contentLength + "]");
			}
		} catch (Exception e) {
			System.out.println("[SaveImage Exception][TargetFile=" + targetFile
					+ "][URL=" + imgurl + "]");
			e.printStackTrace();
			if (bis != null) {
				try {
					bis.close();
				} catch (Exception err) {
				}
			}
			if (bos != null) {
				try {
					bos.close();
				} catch (Exception err) {
				}
			}

			File file = new File(targetFile);
			if (file.exists()) {
				try {
					BufferedInputStream input = new BufferedInputStream(
							new FileInputStream(file));
					if (contentLength - input.available() > 1000) {
						input.close();
						System.out.println("[DeleteFile][TargetFile="
								+ targetFile + "][URL=" + imgurl + "]ok="
								+ file.delete());
					}
				} catch (Exception err) {
					err.printStackTrace();
				}
			}

		}
	}
  
}
