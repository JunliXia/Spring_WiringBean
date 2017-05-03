package com.spring;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

public class HimmaTeam implements People{

	
	private Collection<People> peoples;
	
	private Map<String, String> fruits;
	
	private Properties foods;
	
	
	public HimmaTeam(){
	}
	
	public void doWorking() {
		// TODO Auto-generated method stub
		for (People people : peoples) {
			people.doWorking();
		}
		
		for (String key : fruits.keySet()) {
			System.out.println(key+": 吃了"+ fruits.get(key));
		}
		
		for (Object key : foods.keySet()) {
		      String keyStr = key.toString();
	          String valueStr = foods.getProperty(keyStr);
	          System.out.println(keyStr + ": 吃了"+valueStr);
			
		}

	}

	public void setPeoples(Collection<People> peoples) {
		this.peoples = peoples;
	}

	public void setFruits(Map<String, String> fruits) {
		this.fruits = fruits;
	}

	public void setFoods(Properties foods) {
		this.foods = foods;
	}

	
	
}
