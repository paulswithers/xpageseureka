package com.lugs.jsf;

import java.io.Serializable;

public class SampleBean implements Serializable {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private boolean RowRendered;
	private String type;

	public SampleBean() {
		System.out.println("Initiating SampleBean using basic constructor");
	}

	public SampleBean(String type) {
		System.out.println("Initiating SampleBean for " + type + " using overloaded constructor");
		setType(type);
	}

	public boolean isRowRendered() {
		System.out.println("Getting " + getType() + " isRowRendered");
		return true;
	}

	public boolean getRowRendered() {
		return true;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}
