/**
 * CalculadoraServicesServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.calculadorawebservices.services;

public class CalculadoraServicesServiceLocator extends org.apache.axis.client.Service implements com.calculadorawebservices.services.CalculadoraServicesService {

    public CalculadoraServicesServiceLocator() {
    }


    public CalculadoraServicesServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculadoraServicesServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CalculadoraServices
    private java.lang.String CalculadoraServices_address = "http://localhost:8080/CalculadoraWebServices/services/CalculadoraServices";

    public java.lang.String getCalculadoraServicesAddress() {
        return CalculadoraServices_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalculadoraServicesWSDDServiceName = "CalculadoraServices";

    public java.lang.String getCalculadoraServicesWSDDServiceName() {
        return CalculadoraServicesWSDDServiceName;
    }

    public void setCalculadoraServicesWSDDServiceName(java.lang.String name) {
        CalculadoraServicesWSDDServiceName = name;
    }

    public com.calculadorawebservices.services.CalculadoraServices getCalculadoraServices() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CalculadoraServices_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalculadoraServices(endpoint);
    }

    public com.calculadorawebservices.services.CalculadoraServices getCalculadoraServices(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.calculadorawebservices.services.CalculadoraServicesSoapBindingStub _stub = new com.calculadorawebservices.services.CalculadoraServicesSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalculadoraServicesWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalculadoraServicesEndpointAddress(java.lang.String address) {
        CalculadoraServices_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.calculadorawebservices.services.CalculadoraServices.class.isAssignableFrom(serviceEndpointInterface)) {
                com.calculadorawebservices.services.CalculadoraServicesSoapBindingStub _stub = new com.calculadorawebservices.services.CalculadoraServicesSoapBindingStub(new java.net.URL(CalculadoraServices_address), this);
                _stub.setPortName(getCalculadoraServicesWSDDServiceName());
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
        if ("CalculadoraServices".equals(inputPortName)) {
            return getCalculadoraServices();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.calculadorawebservices.com", "CalculadoraServicesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.calculadorawebservices.com", "CalculadoraServices"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CalculadoraServices".equals(portName)) {
            setCalculadoraServicesEndpointAddress(address);
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
