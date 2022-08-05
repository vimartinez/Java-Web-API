/**
 * DadoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.educacionit.ej02.ws;

public interface DadoService extends javax.xml.rpc.Service {
    public java.lang.String getDadoAddress();

    public com.educacionit.ej02.ws.Dado getDado() throws javax.xml.rpc.ServiceException;

    public com.educacionit.ej02.ws.Dado getDado(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
