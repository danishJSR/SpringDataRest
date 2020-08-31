package com.danish.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien 
{
	@Id
	private int aId;
	private String aName;
	private String tech;
	
	public int getaId() 
	{
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aName=" + aName + ", Tech=" + tech + "]";
	}
}
