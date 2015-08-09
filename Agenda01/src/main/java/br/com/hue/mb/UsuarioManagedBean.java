package br.com.hue.mb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.hue.Usuario;
import br.com.hue.dao.UsuarioDAO;

@ManagedBean
@ViewScoped
public class UsuarioManagedBean implements Serializable{

	private static final long serialVersionUID = -6160176064022594760L;
	
	private Usuario usuario;
	
	private UsuarioDAO usuarioDAO;
	
	public UsuarioManagedBean(){
		usuario = new Usuario();
		usuarioDAO = UsuarioDAO.getObjeto();
	}
	
	public void cadastrar(){
		usuarioDAO.salvar(usuario);
	}

	public void excluir(){
		
	}
	
	public void salvar(){
		
	}
	
	public List<Usuario> getUsuarios() {
		return new ArrayList<Usuario>();
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
}