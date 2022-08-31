package ej08.service;

import ej08.dao.UserDAO;
import ej08.model.User;

public class UserService {
	
	UserDAO userDAO = new UserDAO();

	public Boolean login(String mail, String clave) {
		
		//User user = userDAO.getById(1L);
		//System.out.println("usuario: "+ user.getNombreApellido());
		
		return userDAO.login(mail, clave);
		
	}

}
