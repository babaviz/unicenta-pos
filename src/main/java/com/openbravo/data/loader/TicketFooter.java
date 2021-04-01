

package com.openbravo.data.loader;

import com.openbravo.basic.BasicException;
import com.openbravo.pos.forms.AppViewConnection;
import com.openbravo.pos.forms.DataLogicSales;
import com.openbravo.data.loader.Session;
import com.openbravo.pos.forms.AppConfig;
import com.openbravo.pos.forms.AppLocal;
import java.io.*;

public class TicketFooter {
    private String footer_line1;
    private String footer_line2;       
    private String footer_line3;
    private String footer_line4;
    private String footer_line5;
    private String footer_line6;
    private File m_config;
    private Session session;

    public TicketFooter() {          
        AppConfig config = new AppConfig(m_config);
        // AppViewConnection Session = new AppViewConnection();

    }

    public void loadProperties(AppConfig config) {
        footer_line1=(config.getProperty("till.footer1"));
        footer_line2=(config.getProperty("till.footer2"));
        footer_line3=(config.getProperty("till.footer3"));         
        footer_line4=(config.getProperty("till.footer4"));         
        footer_line5=(config.getProperty("till.footer5"));         
        footer_line6=(config.getProperty("till.footer6"));         
    }
    
    public String getTicketFooterLine1() {
        return footer_line1;
    }
    
    public String getTicketFooterLine2() {
        return footer_line2;
    }
    
    public String getTicketFooterLine3() {
        return footer_line3;
    }
    
    public String getTicketFooterLine4() {
        return footer_line4;
    }
    
    public String getTicketFooterLine5() {
        return footer_line5;
    }
    
    public String getTicketFooterLine6() {
        return footer_line6;
    }
}





