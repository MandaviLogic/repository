package com.example.genericqa.entities;

import java.io.Serializable;



import javax.persistence.*;

@Entity
@Table(name = "questions3")
public class Question implements Serializable{

	private static final long serialVersionUID = -4892239198565611565L;
    
	@Id
	private Long id;
	
	private String title;
	
	private String description;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
