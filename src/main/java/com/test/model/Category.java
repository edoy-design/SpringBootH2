package com.test.model;

public class Category {
	 private int id;
	 private String event1;
	 private String event2;
	 private String event3;
	 private String event4;
	 private String event5;
	 
	 public Category() {
	    }

	 public Category(int id, String event1, String event2, String event3, String event4, String event5) {
	        this.id = id;
	        this.event1 = event1;
	        this.event2 = event2;
	        this.event3 = event3;
	        this.event4 = event4;
	        this.event5 = event5;
	 } 
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEvent1() {
		return event1;
	}
	public void setEvent1(String event1) {
		this.event1 = event1;
	}
	public String getEvent2() {
		return event2;
	}
	public void setEvent2(String event2) {
		this.event2 = event2;
	}
	public String getEvent3() {
		return event3;
	}
	public void setEvent3(String event3) {
		this.event3 = event3;
	}
	public String getEvent4() {
		return event4;
	}
	public void setEvent4(String event4) {
		this.event4 = event4;
	}
	public String getEvent5() {
		return event5;
	}
	public void setEvent5(String event5) {
		this.event5 = event5;
	}

	 

}
