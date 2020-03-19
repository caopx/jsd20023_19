package bbb;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private int age;
	private String gender;
	private String desc;
	public Person(){
		
	 }
	public Person(String name,int age,String gender,String desc ){
		
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String toString(String name,int age,String gender,String desc) {
		String str=name+","+age+","+gender+","+"是一个帅气的人!";
		return str;
		
	}
}
