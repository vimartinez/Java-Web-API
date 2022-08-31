package ej08.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SaludoBean {
	
	public String mensaje() {
		return "Java Web API";
	}

}
