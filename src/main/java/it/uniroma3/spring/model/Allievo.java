package it.uniroma3.spring.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Email;

/**
 * 
 * @author Lorenzo Giusti, Jacopo Grifoni, Silvio Severino
 *
 */
@Entity
public class Allievo
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	private String cognome;
	private Email email;
	private Number telefono;
	private Date data_di_nascita;
	private String luogo_di_nascita;
	
	public Allievo()
	{
	}
	
	public Allievo(String nome, String cognome, Email email, Number telefono, Date data_di_nascita,
			String luogo_di_nascita)
	{
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.telefono = telefono;
		this.data_di_nascita = data_di_nascita;
		this.luogo_di_nascita = luogo_di_nascita;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		id = id;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getCognome()
	{
		return cognome;
	}

	public void setCognome(String cognome)
	{
		this.cognome = cognome;
	}

	public Email getEmail()
	{
		return email;
	}

	public void setEmail(Email email)
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

	public Date getData_di_nascita()
	{
		return data_di_nascita;
	}

	public void setData_di_nascita(Date data_di_nascita)
	{
		this.data_di_nascita = data_di_nascita;
	}

	public String getLuogo_di_nascita()
	{
		return luogo_di_nascita;
	}

	public void setLuogo_di_nascita(String luogo_di_nascita)
	{
		this.luogo_di_nascita = luogo_di_nascita;
	}
}
