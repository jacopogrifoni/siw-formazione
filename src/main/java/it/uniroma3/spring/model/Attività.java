package it.uniroma3.spring.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * 
 * @author Lorenzo Giusti, Jacopo Grifoni, Silvio Severino
 *
 */
@Entity
public class Attività
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nome;
	private Date data;
	
	@ManyToMany
	public List<Allievo> allievi;
	
	public Attività(String nome, Date data)
	{
		this.nome = nome;
		this.data = data;
	}

	public Attività()
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

	public Date getData()
	{
		return data;
	}

	public void setData(Date data)
	{
		this.data = data;
	}

	public List<Allievo> getAllievi()
	{
		return allievi;
	}

	public void setAllievi(List<Allievo> allievi)
	{
		this.allievi = allievi;
	}
}
