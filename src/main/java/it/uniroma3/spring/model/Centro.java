package it.uniroma3.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author Lorenzo Giusti, Jacopo Grifoni, Silvio Severino
 *
 */
@Entity
public class Centro
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nome;
	private String email;
	private Number telefono;
	private Integer capienzaMax;
	
	public Centro(String nome, String email, Number telefono, Integer capienzaMax)
	{
		this.nome = nome;
		this.email = email;
		this.telefono = telefono;
		this.capienzaMax = capienzaMax;
	}
	
	public Centro()
	{
	}

	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public Number getTelefono()
	{
		return telefono;
	}

	public void setTelefono(Number telefono)
	{
		this.telefono = telefono;
	}

	public Integer getCapienzaMax()
	{
		return capienzaMax;
	}

	public void setCapienzaMax(Integer capienzaMax)
	{
		this.capienzaMax = capienzaMax;
	}
}
