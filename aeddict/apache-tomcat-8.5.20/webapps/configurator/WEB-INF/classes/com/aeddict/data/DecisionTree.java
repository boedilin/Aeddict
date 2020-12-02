package com.aeddict.data;

import java.io.Serializable;
import java.util.ArrayList;

public class DecisionTree implements Serializable{

	private static final long serialVersionUID = -3919326887578641929L;
	private ArrayList<QuestionNode> tree;
	
	public ArrayList<QuestionNode> getTree() {
		return tree;
	}

	public void setTree(ArrayList<QuestionNode> tree) {
		this.tree = tree;
	}
	
	public QuestionNode getFirstNode() {
		
		for(QuestionNode node : tree) {
			if(node.getNodeID() == 1){
				return node;
			}
		}	
		return null;
	}
	
	public QuestionNode getSuccessorNode(int successorId){
		for(QuestionNode node : tree) {
			if(node.getNodeID() == successorId) {
				return node;
			}
		}
		return null;
	}
}
