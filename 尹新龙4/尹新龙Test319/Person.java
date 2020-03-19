package Test319;

public class Person {
	private String name;
	private int age;
	private char sex;
	private String desc;
	
	public Person() {
		
	}
	public Person(String name,int age,char sex,String desc) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.desc = desc;
	}
	public String getName(){
	 return name;
	}
	public void setName(String name){
	 this.name=name;
	}
	public int getAge(){
		 return age;
		}
	public void setAge(int age){
		 this.age=age;
		}
	public char getSex(){
		 return sex;
		}
	public void setSex(char sex){
		 this.sex=sex;
		}
	public String getDesc(){
		 return desc;
		}
		public void setDesc(String desc){
		 this.desc=desc;
		}

		public String toString(){
			return "这个人名叫 "+name+",年龄是 "+age+",性别是 "+sex+",描述为 "+desc;
		}

}
