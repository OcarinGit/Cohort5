package com.calculadorawebservices.services;

public class CalculadoraServicesProxy implements com.calculadorawebservices.services.CalculadoraServices {
  private String _endpoint = null;
  private com.calculadorawebservices.services.CalculadoraServices calculadoraServices = null;
  
  public CalculadoraServicesProxy() {
    _initCalculadoraServicesProxy();
  }
  
  public CalculadoraServicesProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculadoraServicesProxy();
  }
  
  private void _initCalculadoraServicesProxy() {
    try {
      calculadoraServices = (new com.calculadorawebservices.services.CalculadoraServicesServiceLocator()).getCalculadoraServices();
      if (calculadoraServices != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculadoraServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculadoraServices)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculadoraServices != null)
      ((javax.xml.rpc.Stub)calculadoraServices)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.calculadorawebservices.services.CalculadoraServices getCalculadoraServices() {
    if (calculadoraServices == null)
      _initCalculadoraServicesProxy();
    return calculadoraServices;
  }
  
  public int resta(int a, int b) throws java.rmi.RemoteException{
    if (calculadoraServices == null)
      _initCalculadoraServicesProxy();
    return calculadoraServices.resta(a, b);
  }
  
  public int multiplicacion(int a, int b) throws java.rmi.RemoteException{
    if (calculadoraServices == null)
      _initCalculadoraServicesProxy();
    return calculadoraServices.multiplicacion(a, b);
  }
  
  public int suma(int a, int b) throws java.rmi.RemoteException{
    if (calculadoraServices == null)
      _initCalculadoraServicesProxy();
    return calculadoraServices.suma(a, b);
  }
  
  public double division(int a, int b) throws java.rmi.RemoteException{
    if (calculadoraServices == null)
      _initCalculadoraServicesProxy();
    return calculadoraServices.division(a, b);
  }
  
  
}