
package com.example.model;

/*
 * @author Bryan Bataluna
 * @edited-by Sam Ong
 * 
 * Notes:
 * Some student information might be optional
 * Look into the Telescoping design pattern. 
 * 
 */

public class Student {
	private String incid;
	private String id;
	private String name;
	private String address;
	private String gender;
	private String age;
	
	public Student() {
	}
	
	public Student(String id,String name, String address,String gender,String age){
		this.id = id;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.age = age;
	}
	
	public String getIncid() {
		return incid;
	}
	public Object setIncid(String incid) {
		return this.incid = incid;
	}
	public String getId() {
		return id;
	}
	public Object setId(String id) {
		return this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
			sb.append("Student[");
			sb.append("Increment Id:"+this.incid);
			sb.append(",Id:"+this.id);
			sb.append(",Name:"+this.name);
			sb.append(",Address:"+this.address);
			sb.append(",Gender:"+this.gender);
			sb.append(",Age:"+this.age);
			sb.append("]");
		return sb.toString();
	}
}
