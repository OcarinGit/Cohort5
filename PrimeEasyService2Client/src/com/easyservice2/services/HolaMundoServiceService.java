/**
 * HolaMundoServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.easyservice2.services;

public interface HolaMundoServiceService extends javax.xml.rpc.Service {
    public java.lang.String getHolaMundoServiceAddress();

    public com.easyservice2.services.HolaMundoService getHolaMundoService() throws javax.xml.rpc.ServiceException;

    public com.easyservice2.services.HolaMundoService getHolaMundoService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
