package day;

import java.awt.Point;

public class Person {
   private String name;
   private int age;
   private String  gender;//性别
   private String desc;//人员描述
   public Person() {
	
}
    public Person( String name, int age, String gender, String desc) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.desc = desc;
}
     /**每个属性的set，get方法*/
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
    public String toString() {
    	return name+","+age+","+gender+","+desc+"!";
    }
 
}
