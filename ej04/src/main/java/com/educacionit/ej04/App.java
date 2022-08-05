package com.educacionit.ej04;

import java.rmi.RemoteException;

import com.educacionit.ej02.ws.DadoProxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Servicio" );
        DadoProxy dadoProxy = new DadoProxy();
        
        try {
			System.out.println("salida:"+dadoProxy.tirarDado(15));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
