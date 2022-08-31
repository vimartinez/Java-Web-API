package ej08.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import ej08.service.UserService;

@ManagedBean
@SessionScoped
public class LoginBean {
	
	UserService userService = new UserService();
	
	private String mail;
	private String clave;
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String login() {
		Boolean resultado = false;
		String navResult = "";
		System.out.println("mail: "+mail+" clave:"+clave);
		resultado = userService.login(mail,clave);
		if (resultado) {
			System.out.println("Login exitoso!");
			navResult = "home";
		}
		else {
			System.out.println("Credenciales incorrectas!");
			navResult = "error";
		}
		System.out.println("mail: "+mail+" clave:"+clave);
		return navResult;
	}

}
