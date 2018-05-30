package it.uniroma3.spring.model;

import java.util.Map;

import javax.persistence.Entity;

/**
 * 
 * @author Lorenzo Giusti, Jacopo Grifoni, Silvio Severino
 *
 */
@Entity
public class Azienda
{
	private static Azienda single_instance = null;
	private Map<Integer, Allievo> allievi; 
	
	private Azienda()
	{
		
	}
	
	public static Azienda getInstance()
	{
		if(single_instance == null)
			single_instance = new Azienda();
		
		return single_instance;
	}

}
