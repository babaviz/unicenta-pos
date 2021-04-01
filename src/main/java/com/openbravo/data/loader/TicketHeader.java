

package com.openbravo.data.loader;

import com.openbravo.basic.BasicException;
import com.openbravo.pos.forms.AppViewConnection;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.data.loader.Session;
import com.openbravo.pos.forms.AppConfig;
import com.openbravo.pos.forms.AppLocal;
import java.io.*;

public class TicketHeader {
    private String header_line1;
    private String header_line2;       
    private String header_line3;
    private String header_line4;
    private String header_line5;
    private String header_line6;
    private File m_config;
    private Session session;

    public TicketHeader() {          
        AppConfig config = new AppConfig(m_config);
        // AppViewConnection Session = new AppViewConnection();

    }

    public void loadProperties(AppConfig config) {
        header_line1=(config.getProperty("till.header1"));
        header_line2=(config.getProperty("till.header2"));
        header_line3=(config.getProperty("till.header3"));         
        header_line4=(config.getProperty("till.header4"));         
        header_line5=(config.getProperty("till.header5"));         
        header_line6=(config.getProperty("till.header6"));         
    }
    
    public String getTicketHeaderLine1() {
        return header_line1;
    }
    
    public String getTicketHeaderLine2() {
        return header_line2;
    }
    
    public String getTicketHeaderLine3() {
        return header_line3;
    }
    
    public String getTicketHeaderLine4() {
        return header_line4;
    }
    
    public String getTicketHeaderLine5() {
        return header_line5;
    }
    
    public String getTicketHeaderLine6() {
        return header_line6;
    }
}





