/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queueapp.entitylib.impl;

import java.util.Calendar;
import queueapp.entitylib.CustomerOrderPending;
import queueapp.entitylib.service.Customer;
import queueapp.tool.hibernate.DAO;

/**
 *
 * @author hilman
 */
public class CustomerImpl implements Customer{

    @Override
    public void addQueue() {
        CustomerOrderPending e = new CustomerOrderPending();
        e.setDateCustomerOrder(Calendar.getInstance().getTime());
        DAO.save(e);
    }
    
}
