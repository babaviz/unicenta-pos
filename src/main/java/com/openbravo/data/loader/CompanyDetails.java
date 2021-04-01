
package com.openbravo.data.loader;


import com.openbravo.pos.forms.AppConfig;
import java.io.*;

/**
 *
 * @author JG uniCenta
 */
public class CompanyDetails {
    private String db_url;
    private String db_user;       
    private String db_password;
    private File m_config;
    private Session session;

    /**
     *
     */
    public CompanyDetails() {          
   
       AppConfig config = new AppConfig(m_config);
}

    /**
     *
     * @param config
     */
    public void loadProperties(AppConfig config) {
         
        db_url=(config.getProperty("db.url"));
        db_user=(config.getProperty("db_user"));
        db_password=(config.getProperty("db.password"));
}

    /**
     *
     * @return
     */
    public String getUser() {
        return db_user;
    }
}