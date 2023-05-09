package org.kuntum.nine.magma.websocketcallback.domain;

public class SMS {
	
public 	String to ;
public  String message ;

public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
@Override
public String toString() {
	return "SMS{" +
    "to='" + to + '\'' +
    ", message='" + message + '\'' +
    '}';
}



}