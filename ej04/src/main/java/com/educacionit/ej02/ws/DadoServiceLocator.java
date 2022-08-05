/**
 * DadoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.educacionit.ej02.ws;

public class DadoServiceLocator extends org.apache.axis.client.Service implements com.educacionit.ej02.ws.DadoService {

    public DadoServiceLocator() {
    }


    public DadoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DadoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Dado
    private java.lang.String Dado_address = "http://localhost:8080/ej03/services/Dado";

    public java.lang.String getDadoAddress() {
        return Dado_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DadoWSDDServiceName = "Dado";

    public java.lang.String getDadoWSDDServiceName() {
        return DadoWSDDServiceName;
    }

    public void setDadoWSDDServiceName(java.lang.String name) {
        DadoWSDDServiceName = name;
    }

    public com.educacionit.ej02.ws.Dado getDado() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Dado_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDado(endpoint);
    }

    public com.educacionit.ej02.ws.Dado getDado(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.educacionit.ej02.ws.DadoSoapBindingStub _stub = new com.educacionit.ej02.ws.DadoSoapBindingStub(portAddress, this);
            _stub.setPortName(getDadoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDadoEndpointAddress(java.lang.String address) {
        Dado_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.educacionit.ej02.ws.Dado.class.isAssignableFrom(serviceEndpointInterface)) {
                com.educacionit.ej02.ws.DadoSoapBindingStub _stub = new com.educacionit.ej02.ws.DadoSoapBindingStub(new java.net.URL(Dado_address), this);
                _stub.setPortName(getDadoWSDDServiceName());
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
        if ("Dado".equals(inputPortName)) {
            return getDado();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.ej02.educacionit.com", "DadoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.ej02.educacionit.com", "Dado"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Dado".equals(portName)) {
            setDadoEndpointAddress(address);
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
