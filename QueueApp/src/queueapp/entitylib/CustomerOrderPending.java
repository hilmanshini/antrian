/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queueapp.entitylib;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author hilman
 */
public class CustomerOrderPending implements Serializable{
    private int numberCustomerOrder;
    private Date dateCustomerOrder;

    /**
     * @return the numberCustomerOrder
     */
    public int getNumberCustomerOrder() {
        return numberCustomerOrder;
    }

    /**
     * @param numberCustomerOrder the numberCustomerOrder to set
     */
    public void setNumberCustomerOrder(int numberCustomerOrder) {
        this.numberCustomerOrder = numberCustomerOrder;
    }

    /**
     * @return the dateCustomerOrder
     */
    public Date getDateCustomerOrder() {
        return dateCustomerOrder;
    }

    /**
     * @param dateCustomerOrder the dateCustomerOrder to set
     */
    public void setDateCustomerOrder(Date dateCustomerOrder) {
        this.dateCustomerOrder = dateCustomerOrder;
    }
}
