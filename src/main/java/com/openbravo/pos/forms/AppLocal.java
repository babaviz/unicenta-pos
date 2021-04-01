
package com.openbravo.pos.forms;

import com.openbravo.beans.LocaleResources;

/**
 * @author Jack Gerrard
 * @author adrianromero
 */
public class AppLocal {


    public static final String APP_NAME = "Softeria POS";
    public static final String APP_ID = "unicentaopos";
    public static final String APP_VERSION = "4.6";

    private static final LocaleResources m_resources;

    static {
        m_resources = new LocaleResources();
        m_resources.addBundleName("pos_messages");
        m_resources.addBundleName("erp_messages");
    }

    /** Creates a new instance of AppLocal */
    private AppLocal() {
    }

    /**
     *
     * @param sKey local values
     * @return string values
     */
    public static String getIntString(String sKey) {
        return m_resources.getString(sKey);
    }

    /**
     *
     * @param sKey local values
     * @param sValues string values
     * @return string values
     */
    public static String getIntString(String sKey, Object ... sValues) {
        return m_resources.getString(sKey, sValues);
    }
}
