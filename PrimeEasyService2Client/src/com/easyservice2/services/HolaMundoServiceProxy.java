package com.easyservice2.services;

public class HolaMundoServiceProxy implements com.easyservice2.services.HolaMundoService {
  private String _endpoint = null;
  private com.easyservice2.services.HolaMundoService holaMundoService = null;
  
  public HolaMundoServiceProxy() {
    _initHolaMundoServiceProxy();
  }
  
  public HolaMundoServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initHolaMundoServiceProxy();
  }
  
  private void _initHolaMundoServiceProxy() {
    try {
      holaMundoService = (new com.easyservice2.services.HolaMundoServiceServiceLocator()).getHolaMundoService();
      if (holaMundoService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)holaMundoService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)holaMundoService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (holaMundoService != null)
      ((javax.xml.rpc.Stub)holaMundoService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.easyservice2.services.HolaMundoService getHolaMundoService() {
    if (holaMundoService == null)
      _initHolaMundoServiceProxy();
    return holaMundoService;
  }
  
  public java.lang.String holaMundo() throws java.rmi.RemoteException{
    if (holaMundoService == null)
      _initHolaMundoServiceProxy();
    return holaMundoService.holaMundo();
  }
  
  
}