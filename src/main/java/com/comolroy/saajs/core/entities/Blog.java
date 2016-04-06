package com.comolroy.saajs.core.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Blog {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	
	@OneToOne
	private Account owner;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Account getOwner() {
		return owner;
	}
	public void setOwner(Account owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", owner=" + owner + "]";
	}
	
	
}
