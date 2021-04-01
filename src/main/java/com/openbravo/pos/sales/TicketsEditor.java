

package com.openbravo.pos.sales;

import com.openbravo.pos.ticket.TicketInfo;

/**
 *
 * @author JG uniCenta
 */
public interface TicketsEditor {
    
    /**
     *
     * @param oTicket
     * @param oTicketExt
     */
    public void setActiveTicket(TicketInfo oTicket, Object oTicketExt); // el ticket mas informacion extra...

    /**
     *
     * @return
     */
    public TicketInfo getActiveTicket(); 
}
