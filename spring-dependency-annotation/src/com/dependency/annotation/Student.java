package com.dependency.annotation;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("21")
	private Integer RollNo;
	@Value("Zafar")
	private String name;
	@Value("123")
	private Short s;
	@Value("12424")
	private Long l;
	@Value("34344554535")
	private Double d;
	@Value("True")
	private Boolean alive;
	@Value("2323.23544")
	private Float f;
	@Value("C")
	private Character c;
	@Value("127")
	private Byte b;
	
	
@Autowired
	private String[] course;
@Autowired
private Set<String> vehical;
@Autowired
private List<String> house;
@Autowired
private Map<String,String> vehicalMap;
@Autowired
private Address add;


	public void setAdd(Address add) {
	this.add = add;
}

	public void setVehicalMap(Map<String, String> vehicalMap) {
	this.vehicalMap = vehicalMap;
}

	public void setRollNo(Integer rollNo) {
		RollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setS(Short s) {
		this.s = s;
	}

	public void setL(Long l) {
		this.l = l;
	}

	public void setD(Double d) {
		this.d = d;
	}

	public void setAlive(Boolean alive) {
		this.alive = alive;
	}

	public void setF(float f) {
		this.f = f;
	}

	public void setC(Character c) {
		this.c = c;
	}

	public void setB(Byte b) {
		this.b = b;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public void setVehical(Set<String> vehical) {
		this.vehical = vehical;
	}

	public void setHouse(List<String> house) {
		this.house = house;
	}

	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", name=" + name + ", s=" + s + ", l=" + l + ", d=" + d + ", alive="
				+ alive + ", f=" + f + ", c=" + c + ", b=" + b + ", course=" + Arrays.toString(course) + ", vehical="
				+ vehical + ", house=" + house + ", vehicalMap=" + vehicalMap + ", add=" + add + "]";
	}

}
