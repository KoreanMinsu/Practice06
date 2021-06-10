package com.javaex.ex06;

public class MyBase extends Base{
	
	private String state;
	
	public MyBase() {
	}

	public MyBase(String state) {
		super();
		this.state = state;
	}
	
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void service(String state) {
		
		if (state.equals("낮")) { //문자열의 같다(==) 는 equals()를 사용합니다.
	            day();
    	} else if(state.equals("밤")) {
	            night();
        } else {
        		afternoon();
        }
    }

	    public void day() {
	        System.out.println("낮에는 열심히 수업듣자");
	    }

	    public void night() {
	    	System.out.println("밤에는 라면");
	    }
	
	    public void afternoon() {
	    	System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	    }
}
