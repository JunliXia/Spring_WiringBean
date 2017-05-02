package com.spring;

public class Himma implements People {

	private int brick = 100;
	
	public Himma(){
		
	}
	
	public Himma(int brick){
		this.brick = brick;
	}
	
	public void doWorking() {
		System.out.println("搬了"+brick+"块砖");
	}

}
