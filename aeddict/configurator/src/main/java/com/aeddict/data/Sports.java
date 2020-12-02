package com.aeddict.data;

import java.io.Serializable;
import java.util.ArrayList;

public class Sports implements Serializable{

	private static final long serialVersionUID = -9147998082918382186L;
	private ArrayList<SportsNode> sports;
	
	public ArrayList<SportsNode> getTree() {
		return sports;
	}

	public void setSports(ArrayList<SportsNode> sports) {
		this.sports = sports;
	}
}
