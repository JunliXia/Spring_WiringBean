package com.spring;

public class SingHimma extends Himma{
	private Song song;
	
	public SingHimma(Song song){
		this.song = song;
	}
	
	public SingHimma(int brickNum,Song song){
		super(brickNum);
		this.song = song;
	}
	
	@Override
	public void doWorking() {
		// TODO Auto-generated method stub
		super.doWorking();
		System.out.println("开始唱歌。。");
		song.sing();
	}
	

	
}
