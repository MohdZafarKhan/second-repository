package com.dependency.annotation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan( basePackages = "com.dependency.annotation")
public class Config {
	
	@Bean
	public String[] courseArray() {
		String[] course= {"Math","Baio"};
		return course;
	}
	@Bean
	public Set<String> vehical(){
		Set<String> vehical=new HashSet<String>();
		vehical.add(new String("car"));
		vehical.add(new String("Bike"));
		return vehical;
	}
	@Bean
	public List<String> house(){
		List<String> house=new ArrayList<String>();
		house.add(new String("Pakka Makan"));
		house.add(new String("kaccha Makan"));
		return house;
	}
	@Bean
	public Map<String,String> vehicalMap(){
		Map<String,String> vehicalMap=new HashMap<String,String>();
		vehicalMap.put("Car",new String("Car"));
		vehicalMap.put("Bike", new String("Bike"));
		vehicalMap.put("Bicyle",new String("Bicyle"));
		return vehicalMap;
	}
	@Bean
	public Address add() {
		Address add=new Address();
		add.setCity("Kanpur");
		add.setState("Up");
		add.setCountry("India");
		
		return add;
	}

}
