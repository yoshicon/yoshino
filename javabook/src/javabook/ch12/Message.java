package javabook.ch12;

public class Message {
	private String id, pw, msg, type;
	
	public Message() {}
	
	public Message(String id, String pw, String msg, String type) {
		this.id = id;
		this.pw = pw;
		this.msg = msg;
		this.type = type;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}	
}