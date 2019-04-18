package com.example.genericqa.entities;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.example.genericqa.entities.Question;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "answers3")
public class Answer implements Serializable{

	private static final long serialVersionUID = 4910777327110380596L;
       
	@Id
	private Long answerId;
	
	private String text;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="questionId",nullable=false)
	@OnDelete(action=OnDeleteAction.CASCADE)
	@JsonIgnore
	private Question question;

	public Long getId() {
		return answerId;
	}

	public void setId(Long answerId) {
		this.answerId = answerId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
}
