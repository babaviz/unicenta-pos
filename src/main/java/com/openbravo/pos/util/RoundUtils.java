

package com.openbravo.pos.util;

import com.openbravo.format.Formats;

/**
 *
 * @author JG uniCenta
 */
public class RoundUtils {
    
    /** Creates a new instance of DoubleUtils */
    private RoundUtils() {
    }
    
    /**
     *
     * @param dValue
     * @return
     */
    public static double round(double dValue) {
        double fractionMultiplier = Math.pow(10.0, Formats.getCurrencyDecimals());
        return Math.rint(dValue * fractionMultiplier) / fractionMultiplier;
    }
    
    /**
     *
     * @param d1
     * @param d2
     * @return
     */
    public static int compare(double d1, double d2) {
        
        return Double.compare(round(d1), round(d2));
    }

    /**
     *
     * @param value
     * @return
     */
    public static double getValue(Double value) {
        return value == null ? 0.0 : value.doubleValue();
    }
}
