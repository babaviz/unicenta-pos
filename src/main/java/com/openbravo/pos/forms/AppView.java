
package com.openbravo.pos.forms;

import com.openbravo.data.loader.Session;
import com.openbravo.pos.printer.DeviceTicket;
import com.openbravo.pos.scale.DeviceScale;
import com.openbravo.pos.scanpal2.DeviceScanner;
import java.util.Date;

/**
 *
 * @author adrianromero
 */
public interface AppView {
    
    public DeviceScale getDeviceScale();
    public DeviceTicket getDeviceTicket();
    public DeviceScanner getDeviceScanner();
    public Session getSession();
    public AppProperties getProperties();

    /**
     *
     * @param beanfactory
     * @return
     * @throws BeanFactoryException
     */
    public Object getBean(String beanfactory) throws BeanFactoryException;
     
    /**
     *
     * @param value
     * @param iSeq
     * @param dStart
     * @param dEnd
     */
    public void setActiveCash(String value, int iSeq, Date dStart, Date dEnd);
    public String getActiveCashIndex();
    public int getActiveCashSequence();
    public Date getActiveCashDateStart();
    public Date getActiveCashDateEnd();

    public void setClosedCash(String value, int iSeq, Date dStart, Date dEnd);    
    public String getClosedCashIndex();    
    public int getClosedCashSequence();    
    public Date getClosedCashDateStart();
    public Date getClosedCashDateEnd();

    public String getInventoryLocation();
    
    public void waitCursorBegin();
    public void waitCursorEnd();
    public AppUserView getAppUserView();

}

