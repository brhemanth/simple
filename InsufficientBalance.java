package com;

public class InsufficientBalance extends Exception {
private String Message;
public InsufficientBalance(String Message) {
	this.Message=Message;
}
@Override
public String getMessage() {
	return Message;
}
}
//Documentation Comment
//Rules to Develop Customize Exception
//1a.Create a class with the Exception
////2a.Extends Exception-> Checked Exception
////2b.Extends RuntimeException -> Unchecked Exception
////3.Override getMEssage()  -> (Variable,Constructor,method)
////4.Invoke the exception object using throw keyword & handle it using try and catch block



















