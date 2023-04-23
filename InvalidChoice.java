package com;

public class InvalidChoice extends Exception{
	private String Message;
	public InvalidChoice(String Message) {
		this.Message=Message;
	}
	@Override
	public String getMessage() {
		return Message;
	}

}
