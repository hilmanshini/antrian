/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queueapp.entitylib.service;

import queueapp.entitylib.CustomerOrderPending;

/**
 *
 * @author hilman
 */
public interface Client {
    public void serveQueue(CustomerOrderPending customerOrderPending);
}
