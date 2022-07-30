package com.educacionit.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.educacionit.model.Usuario;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//logout = 1 es unicamente cuando viene del index a través del link cerrar sesión
		String logout =  request.getParameter("logout");
		if (logout.equals("1")) {
			request.getSession().invalidate();
			request.setAttribute("mensajeLogout", "Sesión cerrada correctamente");
			request.getRequestDispatcher("Formulario.jsp").forward(request, response);
		}
		else {
			response.sendRedirect("index.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		//Recuperando valores enviado por el formulario
		String mail = request.getParameter("email1");
		String clave = request.getParameter("password1");
		
		//emular validación de usuario con bd y generar la sesión
		Usuario usr = validarUsuario(mail, clave);
		if (usr != null) {
			//usuario indentificado correctamente
			HttpSession httpSesion = request.getSession();
			httpSesion.setAttribute("usuario", usr);
			httpSesion.setAttribute("nombre", usr.getNombreApe());
			httpSesion.setAttribute("msg", "Bienvenido ");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else {
			// credenciales incorrectas, mensaje de error y recargar formulario
			request.setAttribute("mensajeError", "Usuario y Clave incorrectos");
			request.getRequestDispatcher("Formulario.jsp").forward(request, response);
		}
		
		//redirigir al index
		//request.setAttribute("mailIngresado", mail);
		//request.getRequestDispatcher("index.jsp").forward(request, response);
		//escribir en pantalla
		//response.getWriter().append("Petición POST: ").append(mail);
	}
	
	
	private Usuario validarUsuario(String mail, String clave) {
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario("Victor Martinez", "victordmart@gmail.com","1234"));
		usuarios.add(new Usuario("Pepe Sanchez", "pepe@gmail.com","12345"));
		usuarios.add(new Usuario("Mario Gomez", "mario@gmail.com","123456"));
		
		for (Usuario usuario : usuarios) {
			if ((usuario.getUserName().equalsIgnoreCase(mail) && (usuario.getPassword().equals(clave)))){
				return usuario;
			}
		}
		return null;
	}

}
