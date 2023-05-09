package org.nioun.essentials.notificate.dto;

public class ResponseMessage {

	private String content ;

	
	
	public ResponseMessage() {
	}



	public ResponseMessage(String content) {
		this.content = content;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	@Override
	public String toString() {
		return "ResponseMessage [content=" + content + "]";
	}
	
	
	
}
