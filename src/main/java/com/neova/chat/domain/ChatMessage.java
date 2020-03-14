package com.neova.chat.domain;

public class ChatMessage {
	// type of msg like chat, new user has been added
	private String type;
	private String content;
	// which client is sending the meesgae
	private String sender;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

}
