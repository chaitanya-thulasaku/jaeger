package com.irecruit.form.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class AnswerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long answerId;
	private String response;
	private Date answeredDate;
	private long linkedOption;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="linked_question")
	private QuestionEntity linkedQuestionEntity;

	public Long getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Long answerId) {
		this.answerId = answerId;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public Date getAnsweredDate() {
		return answeredDate;
	}

	public void setAnsweredDate(Date answeredDate) {
		this.answeredDate = answeredDate;
	}

	public QuestionEntity getLinkedQuestion() {
		return linkedQuestionEntity;
	}

	public void setLinkedQuestion(QuestionEntity linkedQuestionEntity) {
		this.linkedQuestionEntity = linkedQuestionEntity;
	}

	public long getLinkedOption() {
		return linkedOption;
	}

	public void setLinkedOption(long linkedOption) {
		this.linkedOption = linkedOption;
	}

}
