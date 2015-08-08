package br.com.hue.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import br.com.hue.Usuario;

@ManagedBean
public class UsuarioManagedBean implements Serializable{

	private static final long serialVersionUID = -6160176064022594760L;
	
	private Usuario bean;

	public void gravar(){
		
	}
	
	
	public Usuario getBean() {
		return bean;
	}

	public void setBean(Usuario bean) {
		this.bean = bean;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
