package com.spring;

public class Himma implements People {
	//默认一天搬100块砖
	private int brickNum = 100;
	//默认填5个坑
	private int pitNum = 5;
	
	public Himma(){
		
	}
	
	public Himma(int brickNum){
		this.brickNum = brickNum;
	}
	
	public Himma(int brickNum, int pitNum){
		this.brickNum = brickNum;
		this.pitNum= pitNum;
	}
	
	public void doWorking() {
		System.out.println("今天搬了"+brickNum+"块砖,还填了"+pitNum+"个坑");
	}

	public int getBrickNum() {
		return brickNum;
	}

	public void setBrickNum(int brickNum) {
		this.brickNum = brickNum;
	}

	public int getPitNum() {
		return pitNum;
	}

	public void setPitNum(int pitNum) {
		this.pitNum = pitNum;
	}
	
	
	

	
	
	
}
