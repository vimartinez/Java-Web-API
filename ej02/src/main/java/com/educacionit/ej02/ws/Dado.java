package com.educacionit.ej02.ws;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WebService
public class Dado {
	
	public Integer tirarDado6() {
		return (int) (Math.random()*6+1);
	}
	
	@WebMethod(operationName = "TirarLosDados")
	@WebResult(name="Resultado")
	public String tirarDado(@WebParam(name="CantidadDeCaras")@XmlElement(required=true,nillable=false) Integer cantidadDeCaras) {
		
		String resultado = "";
		ArrayList<Integer> carasSoportadas = new ArrayList<Integer>();
		carasSoportadas.add(4);
		carasSoportadas.add(6);
		carasSoportadas.add(8);
		carasSoportadas.add(12);
		carasSoportadas.add(20);
		
		if(carasSoportadas.contains(cantidadDeCaras)) {
			resultado = (Integer.valueOf((int)(Math.random()*cantidadDeCaras+1))).toString();
		}
		else {
			resultado = "No existe un dado con "+cantidadDeCaras+" caras!";
		}
		
		return resultado;
		
	}
}
