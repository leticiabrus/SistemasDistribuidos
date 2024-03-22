package br.com.unicuritiba.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Lutador {

	@Id
	private long id;
	private int ki; 
	private float peso; 
	private float altura;
	private int estamina; 
	private String nome;
	private int inscricao;
	
	public long getId() {
		return id; 
		
		
	}
	
	
	
}	
