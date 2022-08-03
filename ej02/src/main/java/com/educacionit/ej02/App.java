package com.educacionit.ej02;

import javax.xml.ws.Endpoint;

import com.educacionit.ej02.ws.Dado;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Levantando WS dado" );
        Endpoint.publish("http://localhost:8081/wssoap/tirardado6", new Dado());
        Endpoint.publish("http://localhost:8081/wssoap/tirardado", new Dado());
    }
}
