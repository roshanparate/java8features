package com.java.vo;

public class Movie {
	public String name;
	public String hero;
	public String heroine;
	
	public Movie(String name, String hero, String heroine) {
		super();
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", hero=" + hero + ", heroine=" + heroine + "]";
	}
	
}
