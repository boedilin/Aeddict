package com.aeddict.data;

import java.io.Serializable;

public class SportsNode implements Serializable {

	private static final long serialVersionUID = -1997496647743010536L;
	private String sport;
	private String filename;
	private String tag;
	private String imageName;
	
	public String getFilename() {
		return filename;
	}

	public String getSport() {
		return sport;
	}
	
	public String getTag() {
		return tag;
	}
	
	public String getImageName(){
		return imageName;
	}
}