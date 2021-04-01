

package com.openbravo.basic;

/**
 *
 * @author JG uniCenta
 */
public class BasicException extends java.lang.Exception {
    
    /**
     * Creates a new instance of <code>DataException</code> without detail message.
     */
    public BasicException() {
    }

    /**
     *
     * @param msg
     */
    public BasicException(String msg) {
        super(msg);
    }
    
    /**
     *
     * @param msg
     * @param cause
     */
    public BasicException(String msg, Throwable cause) {
        super(msg, cause);
    }
    
    /**
     *
     * @param cause
     */
    public BasicException(Throwable cause) {
        super(cause);
    }
}
