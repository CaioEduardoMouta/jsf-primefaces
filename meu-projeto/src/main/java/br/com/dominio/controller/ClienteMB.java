package br.com.dominio.controller;

import java.io.Serializable;

public class ClienteMB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String tipoPessoa = "FISICA";
	
	public String getTipoPessoa() {
		
		return tipoPessoa;
	}
	
	public void setTipoPessoa(String tipoPessoa) {
		
		this.tipoPessoa = tipoPessoa;
	}

}
