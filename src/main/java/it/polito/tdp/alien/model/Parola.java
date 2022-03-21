package it.polito.tdp.alien.model;

import java.util.*;

public class Parola {
	
	private String alieno;
	
	private List <String> traduzioni;
	
	public Parola(String alieno) {
		super();
		this.alieno = alieno;
		
		this.traduzioni= new LinkedList<String>();
	}
	
	public String getAlieno() {
		return alieno;
	}
	public void setAlieno(String alieno) {
		this.alieno = alieno;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alieno == null) ? 0 : alieno.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parola other = (Parola) obj;
		if (alieno == null) {
			if (other.alieno != null)
				return false;
		} else if (!alieno.equals(other.alieno))
			return false;
		
		return true;
	}

	public List<String> getTraduzioni() {
		return traduzioni;
	}

	public void setTraduzioni(List<String> traduzioni) {
		this.traduzioni = traduzioni;
	}
	
	public void setSignificato(String s) {
		this.traduzioni.add(s);
	}

	
	
	

	
	
	

}
