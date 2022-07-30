package com.educacionit.model;

public class Usuario {
	private String nombreApe;
	private String userName;
	private String password;
	
	public Usuario() {
		
	}
	
	public Usuario(String nombreApe, String userName, String password) {
		super();
		this.nombreApe = nombreApe;
		this.userName = userName;
		this.password = password;
	}

	public String getNombreApe() {
		return nombreApe;
	}

	public void setNombreApe(String nombreApe) {
		this.nombreApe = nombreApe;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
