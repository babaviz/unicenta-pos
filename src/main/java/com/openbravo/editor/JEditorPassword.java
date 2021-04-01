
package com.openbravo.editor;

import com.openbravo.basic.BasicException;

/**
 *
 * @author JG uniCenta
 */
public class JEditorPassword extends JEditorText {

    private static final char ECHO_CHAR = '*';

    /** Creates a new instance of JEditorPassword */
    public JEditorPassword() {
        super();
    }

    /**
     *
     * @return
     */
    protected final int getMode() {
        return EditorKeys.MODE_INTEGER_POSITIVE;
    }

    /**
     *
     * @return
     */
    protected int getStartMode() {
        return MODE_123;
    }

    /**
     *
     * @return
     */
    protected String getTextEdit() {

        StringBuilder s = new StringBuilder();
        s.append("<html>");
        s.append(getEcho(m_svalue));
        if (m_cLastChar != '\u0000') {
            s.append("<font color=\"#a0a0a0\">");
            s.append(ECHO_CHAR);
            s.append("</font>");
        }
        s.append("<font color=\"#a0a0a0\">_</font>");

        return s.toString();
    }

    /**
     *
     * @return
     */
    public final String getPassword() {

        // como clave nunca devolvemos null
        String sPassword = getText();
        return sPassword == null ? "" : sPassword;
    }

    /**
     *
     * @return
     * @throws BasicException
     */
    protected String getTextFormat() throws BasicException {
        return "<html>" + getEcho(m_svalue);
    }

    private String getEcho(String sValue) {

        if (sValue == null) {
            return "";
        } else {
            char[] c = new char[sValue.length()];
            for(int i = 0; i < sValue.length(); i++) {
                c[i] = ECHO_CHAR;
            }
            return new String(c);
        }
    }
}
