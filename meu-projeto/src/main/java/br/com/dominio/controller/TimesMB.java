package br.com.dominio.controller;

import java.awt.List;
import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("ligaBBVA")
@SessionScoped
public class TimesMB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private List<String> timesEspanhois;
	
	public void selecionar() {
		for (String times : timesEspanhois) {
			System.out.println(times);
		}
	}
	
	public List<String> getTimesEspanhois() {
		return timesEspanhois;
	}
	
	public void setTimesEspanhois(List<String> timesEspanhois) {
		this.timesEspanhois = timesEspanhois;
	}

}
