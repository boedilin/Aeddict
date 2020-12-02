package com.aeddict.data;

import java.io.Serializable;

public class QuestionNodeData implements Serializable{
	private static final long serialVersionUID = -9028002271086177179L;
	private String answer;
	private String tags;
	private int successorID;
	
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public int getSuccessor() {
		return successorID;
	}
	public void setSuccessor(int successorID) {
		this.successorID = successorID;
	}
}
