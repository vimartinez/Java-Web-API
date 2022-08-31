package ej08.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ej08.model.User;



public class UserDAO implements DAO<User, Long>, MySQLConnection {

	private PreparedStatement psGet = null;
	private PreparedStatement psAdd = null;
	private PreparedStatement psUpd = null;
	private PreparedStatement psDel = null;
	private PreparedStatement psGetAll = null;
	private PreparedStatement psLogin = null;
	@Override
	public Boolean add(User user) {
		Boolean resultado = false;
		try {
			if (psAdd == null) {
				psAdd = conectarBD().prepareStatement("INSERT INTO jwa.users (ID, nombreApellido, mail, direccion, clave, fechaNacimiento)"
						+ " VALUES(?, ?, ?, ?, MD5(?), ?);");
			}
			psAdd.setLong(1, user.getId());
			psAdd.setString(2, user.getNombreApellido());
			psAdd.setString(3, user.getMail());
			psAdd.setString(4, user.getDireccion());
			psAdd.setString(5, user.getClave());
			psAdd.setDate(6, (Date) user.getFechaNacimiento());
			if (psAdd.executeUpdate()==1) resultado = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}

	@Override
	public Boolean del(User user) {
		Boolean resultado = false;
		try {
			if(psDel==null) {
				psDel = conectarBD().prepareStatement("DELETE FROM jwa.users WHERE id = ?;");
			}
			psDel.setLong(1, user.getId());
			if (psDel.executeUpdate()==1) resultado = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}

	@Override
	public Boolean upd(User user) {
		Boolean resultado = false;
		try {
			if (psUpd==null) {
				psUpd = conectarBD().prepareStatement("UPDATE jwa.users SET nombreApellido=?, mail=?, direccion=?, clave=?, "
						+ "fechaNacimiento=? WHERE ID=?;");
			}
			psUpd.setString(1, user.getNombreApellido());
			psUpd.setString(2, user.getMail());
			psUpd.setString(3, user.getDireccion());
			psUpd.setString(4, user.getClave());
			psUpd.setDate(5, (Date) user.getFechaNacimiento());
			psUpd.setLong(6, user.getId());
			if (psUpd.executeUpdate()==1) resultado = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}

	@Override
	public User getById(Long id) {
		User userAux = new User();
		try {
			if (psGet==null) {
				psGet = conectarBD().prepareStatement("SELECT ID, nombreApellido, mail, direccion, clave, fechaNacimiento "
						+ "FROM jwa.users WHERE ID = ?;" );
			}
			psGet.setLong(1, id);
			ResultSet resultado = psGet.executeQuery();
			if(resultado.next()) {
				userAux.setNombreApellido(resultado.getString("nombreApellido"));
				userAux.setClave(resultado.getString("clave"));
				userAux.setDireccion(resultado.getString("direccion"));
				userAux.setId(resultado.getLong("id"));
				userAux.setMail(resultado.getString("direccion"));
			}
			else {
				userAux = null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userAux;
	}

	@Override
	public List<User> getAll() {
		List<User> listadoUsuarios = new ArrayList<>();
		try {
			if (psGetAll == null) {
				psGetAll = conectarBD().prepareStatement("SELECT ID, nombreApellido, mail, direccion, clave, fechaNacimiento FROM jwa.users");
			}
			ResultSet resultado = psGetAll.executeQuery();
			while(resultado.next()) {
				User userAux = new User();
				userAux.setNombreApellido(resultado.getString("nombreApellido"));
				userAux.setClave(resultado.getString("clave"));
				userAux.setDireccion(resultado.getString("direccion"));
				userAux.setId(resultado.getLong("id"));
				userAux.setMail(resultado.getString("direccion"));
				listadoUsuarios.add(userAux);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listadoUsuarios;
	}

	public Boolean login(String mail, String clave) {
		Boolean resultado = false;
		try {
			if(psLogin==null) {
				psLogin = conectarBD().prepareStatement("SELECT ID, nombreApellido, mail, direccion, clave, fechaNacimiento "
						+ "FROM jwa.users "
						+ "WHERE mail = ? "
						+ "AND clave =MD5(?);");
			}
			psLogin.setString(1, mail);
			psLogin.setString(2, clave);
			ResultSet doLogin = psLogin.executeQuery();
			if(doLogin.next()) {
				resultado = true;
			}
			else {
				resultado = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}

}
