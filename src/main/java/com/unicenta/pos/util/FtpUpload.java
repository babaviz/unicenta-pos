
package com.unicenta.pos.util;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FtpUpload extends Thread {

    private static final int BUFFER_SIZE = 1024;
    private static String sMachine;

    @Override
    public void run() {
        String ftpUrl = "";
        String host = "";
        String user = "";
        String pass = "";

        try {
            sMachine = InetAddress.getLocalHost().getHostName();

            String filePath = System.getProperty("user.home") + "/" + sMachine + ".lau";
            String uploadPath = sMachine + ".lau";

            ftpUrl = String.format(ftpUrl, user, pass, host, uploadPath);

            URL url = new URL(ftpUrl);
            URLConnection conn = url.openConnection();
            try (OutputStream outputStream = conn.getOutputStream(); 
                    FileInputStream inputStream = new FileInputStream(filePath)) {
                
                byte[] buffer = new byte[BUFFER_SIZE];
                int bytesRead = -1;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                
            }

        }
        catch (IOException ex) {
            Logger.getLogger(this.getName()).log(Level.SEVERE, null, ex);
        }
    }
}