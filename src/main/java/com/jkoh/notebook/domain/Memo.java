package com.jkoh.notebook.domain;

public class Memo {
	private double sn; 
    private String content;
    
    public Memo() {}

	public Memo(String content) {
		super();
		this.content = content;
	}

	public double getSn() {
		return sn;
	}
	public void setSn(double sn) {
		this.sn = sn;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	} 
    
    
}
