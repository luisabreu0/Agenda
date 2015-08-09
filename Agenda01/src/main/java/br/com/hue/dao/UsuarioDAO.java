package br.com.hue.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.hue.Usuario;

public class UsuarioDAO {
	
	private static UsuarioDAO usuarioDAO;
	private EntityManager manager;
	
	private UsuarioDAO(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Agenda01");
		manager = factory.createEntityManager();
	}
	
	public synchronized  static UsuarioDAO getObjeto(){
		if(usuarioDAO == null){
			usuarioDAO = new UsuarioDAO();
		}
		return usuarioDAO;
	}
	
	
	public void salvar(Usuario usuario){
		EntityTransaction trx = manager.getTransaction();
		
		try{
			trx.begin();
			
			manager.persist(usuario);
			
			trx.commit();
		}catch(Exception ex){
			trx.rollback();
		}
	}
	
	public void editar(Usuario usuario){
		
	}
		
	public void excluir(Usuario usuario){
		
	}
	
	public List<Usuario> Listar(){
		return null;
	}
}
