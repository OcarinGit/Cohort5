/**
 * HolaMundoServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.easyservice2.services;

public class HolaMundoServiceServiceLocator extends org.apache.axis.client.Service implements com.easyservice2.services.HolaMundoServiceService {

    public HolaMundoServiceServiceLocator() {
    }


    public HolaMundoServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HolaMundoServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HolaMundoService
    private java.lang.String HolaMundoService_address = "http://localhost:8080/PrimeEasyService2/services/HolaMundoService";

    public java.lang.String getHolaMundoServiceAddress() {
        return HolaMundoService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HolaMundoServiceWSDDServiceName = "HolaMundoService";

    public java.lang.String getHolaMundoServiceWSDDServiceName() {
        return HolaMundoServiceWSDDServiceName;
    }

    public void setHolaMundoServiceWSDDServiceName(java.lang.String name) {
        HolaMundoServiceWSDDServiceName = name;
    }

    public com.easyservice2.services.HolaMundoService getHolaMundoService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HolaMundoService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHolaMundoService(endpoint);
    }

    public com.easyservice2.services.HolaMundoService getHolaMundoService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.easyservice2.services.HolaMundoServiceSoapBindingStub _stub = new com.easyservice2.services.HolaMundoServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getHolaMundoServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHolaMundoServiceEndpointAddress(java.lang.String address) {
        HolaMundoService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.easyservice2.services.HolaMundoService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.easyservice2.services.HolaMundoServiceSoapBindingStub _stub = new com.easyservice2.services.HolaMundoServiceSoapBindingStub(new java.net.URL(HolaMundoService_address), this);
                _stub.setPortName(getHolaMundoServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HolaMundoService".equals(inputPortName)) {
            return getHolaMundoService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.easyservice2.com", "HolaMundoServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.easyservice2.com", "HolaMundoService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HolaMundoService".equals(portName)) {
            setHolaMundoServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
