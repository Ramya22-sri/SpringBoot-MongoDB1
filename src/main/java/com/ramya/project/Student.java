package com.ramya.project;

public class Student {
	
	private int id;
	private String name;
	private int age;
	private String gender;
	private float grade;
	
	//default constructor
	public Student()
	{
		
	}
	
	//parameterized constructor
	public Student(int id, String name, int age, String gender, float grade) {
		super();
		this.setId(id);
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
		this.setGrade(grade);
	}

    //setters and getters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public float getGrade() {
		return grade;
	}


	public void setGrade(float grade) {
		this.grade = grade;
	}

}
