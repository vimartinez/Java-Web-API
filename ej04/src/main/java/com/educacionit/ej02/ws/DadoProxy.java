package com.educacionit.ej02.ws;

public class DadoProxy implements com.educacionit.ej02.ws.Dado {
  private String _endpoint = null;
  private com.educacionit.ej02.ws.Dado dado = null;
  
  public DadoProxy() {
    _initDadoProxy();
  }
  
  public DadoProxy(String endpoint) {
    _endpoint = endpoint;
    _initDadoProxy();
  }
  
  private void _initDadoProxy() {
    try {
      dado = (new com.educacionit.ej02.ws.DadoServiceLocator()).getDado();
      if (dado != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dado)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dado)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dado != null)
      ((javax.xml.rpc.Stub)dado)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.educacionit.ej02.ws.Dado getDado() {
    if (dado == null)
      _initDadoProxy();
    return dado;
  }
  
  public java.lang.String tirarDado(int cantidadDeCaras) throws java.rmi.RemoteException{
    if (dado == null)
      _initDadoProxy();
    return dado.tirarDado(cantidadDeCaras);
  }
  
  
}