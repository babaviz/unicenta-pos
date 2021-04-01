

package com.openbravo.pos.printer;

/**
 *
 * @author adrianromero
 */
public class NullAnimator implements DisplayAnimator {
    
    /**
     *
     */
    protected String currentLine1;

    /**
     *
     */
    protected String currentLine2;

    /**
     *
     * @param line1
     * @param line2
     */
    public NullAnimator(String line1, String line2) {
        currentLine1 = DeviceTicket.alignLeft(line1, 20);
        currentLine2 = DeviceTicket.alignLeft(line2, 20);
    }

    /**
     *
     * @param i
     */
    @Override
    public void setTiming(int i) {
    }

    /**
     *
     * @return
     */
    @Override
    public String getLine1() {
        return currentLine1;
    }

    /**
     *
     * @return
     */
    @Override
    public String getLine2() {
        return currentLine2;
    }
}
