package com.aeddict.data;

import java.io.Serializable;
import java.util.ArrayList;

public class QuestionNode implements Serializable{
	private static final long serialVersionUID = -8590468639726713163L;
	private int nodeID;
	private String question;
	private ArrayList<QuestionNodeData> data;
	private ArrayList<QuestionNodeImages> imageNames;
	
	public int getNodeID() {
		return nodeID;
	}

	public void setNodeID(int nodeID) {
		this.nodeID = nodeID;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public ArrayList<QuestionNodeData> getData() {
		return data;
	}

	public void setData(ArrayList<QuestionNodeData> data) {
		this.data = data;
	}
	
	public ArrayList<QuestionNodeImages> getImageNames(){
		return imageNames;
	}
}
