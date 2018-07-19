package com.example.demo.entity;

public enum SexEnum {
	MALE("男"),FEMALE("女");
	
	private String name;
	
	private SexEnum(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name();
	}
}
