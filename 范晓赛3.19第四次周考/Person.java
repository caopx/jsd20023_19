package exam319;

public class Person {
	private String name;
	private int age;
	private String sex;
	private String desc;
	
	Person(){	
	}
	Person(String name,int age,String sex,String desc){
		
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String toString() {
		return name+","+age+sex+desc;
	}
}









